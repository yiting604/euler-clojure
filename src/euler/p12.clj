(ns euler.p12
  (:gen-class)
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
  [m n]
  (let [v (into (-> m half-if-even factors) (-> n half-if-even factors))]
    (map #(count (filter (partial = %) v)) (distinct v))
    )
  )

(defn divisor-count "divisor count for n"
  [m n]
  (let [v (unique-factor-counts m n)]
    (let [c (reduce * (map inc v))]
      (do c)
      )
    )
  )

(defn first-divisible-triangular
  [n]
  (loop [x 2]
    (if (<= n (divisor-count x (inc x)))
      (/ (* x (inc x)) 2)
      (recur (inc x))
      )
    )
  )

(defn -main
  [& args]
    (println (first-divisible-triangular 500))
  )
