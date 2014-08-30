(ns euler.p2
  (:gen-class))

(defn fib
  [a b]
  (lazy-cat [a] (fib (+ a b) a))
  )

(defn fib-under
  [limit]
  (take-while (partial > limit) (fib 1 0))
  )

(defn -main
  [& args]
  (println (reduce + (filter even? (fib-under 4000000))))
  )
