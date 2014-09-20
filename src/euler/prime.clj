(ns euler.prime
  (:gen-class)
  (:require [clojure.math.numeric-tower :as math]))

(defn prime? "Returns false if x is dividable by any of v"
  [x v]
  (loop [i 0 n (count v)]
    (if (< i n)
      (if (= 0 (rem x (nth v i)))
        false
        (recur (inc i) n)
        )
      true
      )
    )
  )

(defn next-candidate
  [x]
  (if (= x 2) 3 (+ x 2))
  )

(defn nth-prime
  [n]
  (loop [x 2 v (transient [])]
    (if (< (count v) n)
      (if (prime? x v)
        (recur (next-candidate x) (conj! v x))
        (recur (next-candidate x) v)
        )
      (last (persistent! v))
      )
    )
  )

(defn primes-under "Returns prime numbers less than x"
  ([n] (primes-under n []))
  ([n primes]
    (loop [x (if (empty? primes) 2 (last primes)) v primes]
      (if (<= x n)
        (if (prime? x v)
          (recur (next-candidate x) (conj v x))
          (recur (next-candidate x) v)
          )
        v
        )
      )
    )
  )

(defn factors
  ([n] (factors n (primes-under n)))
  ([n primes]
    (loop [x n v [] ps primes ]
      (if (empty? ps)
        v
        (let [p (first ps)]
          (if (= 0 (rem x p))
            (recur (/ x p) (conj v p) ps)
            (recur x v (rest ps))
            )
          )
        )
      )
    )
  )
