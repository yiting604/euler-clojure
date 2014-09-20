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
  [n]
  (let [v (factors n)]
    (map #(count (filter (partial = %) v)) (distinct v))
    )
  )

(defn divisor-count "divisor count for n"
  [n]
  (let [v (unique-factor-counts n)]
    (let [c (reduce * (map inc v))]
      (do c)
      )
    )
  )

(defn first-divisible-triangular
  [n]
  (loop [x 1 c 1]
    (let [m (-> x inc half-if-even divisor-count)]
      (if (<= n (* c m))
        (/ (* x (inc x)) 2)
        (recur (inc x) m)
        )
      )
    )
  )

(defn -main
  [& args]
    (println (time (first-divisible-triangular 500)))
  )
