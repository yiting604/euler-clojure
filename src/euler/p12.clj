(ns euler.p12
  (:require
    [euler.prime :refer :all]
    [clojure.math.numeric-tower :as math]
    )
  )

(defn half-if-even
  [n]
  (if (= 0 (rem n 2))
    (/ n 2)
    n
    )
  )

(defn unique-factor-counts
  [n primes]
  (let [v (find-factors n primes)]
    (map #(count (filter (partial = %) v)) (distinct v))
    )
  )

(defn divisor-count "divisor count for n"
  [n primes]
  (let [v (unique-factor-counts n primes)]
    (let [c (reduce * (map inc v))]
      (do c)
      )
    )
  )

(defn first-divisible-triangular
  [n]
  (loop [x 1 c 1 primes []]
    (def ps (find-primes-under (inc x) primes))
    (def m (divisor-count (-> x inc half-if-even) ps))
    (if (<= n (* c m))
      (/ (* x (inc x)) 2)
      (recur (inc x) m ps)
      )
    )
  )

(defn -main
  [& args]
    (println (time (first-divisible-triangular 500)))
  )
