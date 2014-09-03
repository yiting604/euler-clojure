(ns euler.p2
  (:gen-class))

(defn fib
  [a b]
  (lazy-cat [a] (fib (+ a b) a)))

(defn fib-under
  [x]
  (take-while (partial > x) (fib 1 0)))

(defn sum-even-fibs
  [x]
  (reduce + (filter even? (fib-under x))))

(defn -main
  [& args]
  (println (sum-even-fibs 4000000)))
