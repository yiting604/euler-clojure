(ns euler.prime)

(defn is-prime? "Returns false if x can be divided by any of primes, which could be transient"
  [x primes]
  (def n (count primes))
  (loop [i 0]
    (cond
      (>= i n)
        true
      (= 0 (rem x (nth primes i)))
        false
      :else
        (recur (inc i))
      )
    )
  )

(defn get-next-candidate
  [x]
  (if (= x 2) 3 (+ x 2))
  )

(defn find-nth-prime
  [n]
  (loop [x 2 v (transient [])]
    (def next-candidate (get-next-candidate x))
    (cond
      (>= (count v) n)
        (last (persistent! v))
      (is-prime? x v)
        (recur next-candidate (conj! v x))
      :else
        (recur next-candidate v)
      )
    )
  )

(defn find-primes-under "Returns prime numbers less than n"
  ([n] (find-primes-under n []))
  ([n primes]
    (def starting-number (if (empty? primes) 2 (last primes)))
    (loop [x starting-number v primes]
      (def next-candidate (get-next-candidate x))
      (cond
        (> x n)
          v
        (is-prime? x v)
          (recur next-candidate (conj v x))
        :else
          (recur next-candidate v)
        )
      )
    )
  )

(defn find-factors "find all prime factors for number n"
  ([n] (find-factors n (find-primes-under n)))
  ([n pre-primes]
    (loop [x n factors [] [next-prime & more-primes :as primes] pre-primes]
      (cond
        (empty? primes)
          factors
        (= 0 (rem x next-prime))
          (recur (/ x next-prime) (conj factors next-prime) primes)
        :else
          (recur x factors (rest primes))
        )
      )
    )
  )
