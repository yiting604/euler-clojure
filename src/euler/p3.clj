(ns euler.p3
  (:gen-class))

(defn prime? "Returns false if x is dividable by any of v"
  [x v]
  (reduce #(and %1 %2) true (map #(not= 0 (rem x %)) v))
  )

(defn primes "Returns prime numbers less than x"
  [x]
  (reduce #(if (prime? %2 %1) (conj %1 %2) %1) [] (range 2 x))
  )

(defn prime-factors "Returns prime factors of x"
  [x]
  (filter #(= 0 (rem x %)) (primes (inc (/ x 2))))
  )

(defn -main
  [& args]
  (println (prime-factors 600851475143)))
