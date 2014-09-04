(ns euler.p4
  (:gen-class))

(use 'clojure.math.numeric-tower)

(defn sum-square-power
  [n]
  (reduce + (map #(* % %) (range (inc n)))))

(defn square-power-sum
  [n]
  (#(* % %) (reduce + (range (inc n)))))

(defn -main
  [& args]
  (println (- (square-power-sum 100) (sum-square-power 100))))
