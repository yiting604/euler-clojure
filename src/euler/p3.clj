(ns euler.p3
  (:gen-class))

(defn prime? "Returns false if x is dividable by any of v, although not used"
  [x v]
  (if (empty? v)
    true
    (if
      (= 0 (rem x (first v)))
      false
      (recur x (rest v))
      )
    )
  )

(defn primes "Returns prime numbers less than x, although not used"
  [x]
  (reduce #(if (prime? %2 %1) (conj %1 %2) %1) [] (range 2 x))
  )

(defn max-prime-factor "Returns max prime factor of x"
  [x c]
  (if
    (= 0 (rem x c))
    (recur (/ x c) c)
    (if
      (= 1 x)
      c
      (recur x (inc c))
      )
    )
  )

(defn -main
  [& args]
  (println (max-prime-factor 600851475143 2)))
