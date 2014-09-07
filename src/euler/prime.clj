(ns euler.prime
  (:gen-class))

(defn prime? "Returns false if x is dividable by any of v"
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

(defn primes-under "Returns prime numbers less than x"
  [x]
  (reduce #(if (prime? %2 %1) (conj %1 %2) %1) [] (range 2 x))
  )
