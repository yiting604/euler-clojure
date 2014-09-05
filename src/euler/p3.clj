(ns euler.p3
  (:gen-class))

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
