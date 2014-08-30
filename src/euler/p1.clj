(ns euler.p1
  (:gen-class))

(defn dividable
  [x d]
  (= 0 (rem x d))
  )

(defn dividable_3_5
  [x]
  (or (dividable x 3) (dividable x 5))
  )

(defn sum_of_mul_3_5
  [n]
  (reduce + (filter dividable_3_5 (range n)))
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (sum_of_mul_3_5 1000))
  )
