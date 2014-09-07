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

(defn next-candidate
  [x]
  (if (= x 2) 3 (+ x 2))
  )

(defn find-nth-prime
  [n x v]
  (if (= n 0)
    x
    (if (prime? x v)
      (recur (dec n) x (cons x v))
      (recur n (next-candidate x) v)
      )
    )
  )

(defn nth-prime
  [n]
  (find-nth-prime n 2 [])
  )

(defn primes-under "Returns prime numbers less than x"
  [x]
  (reduce #(if (prime? %2 %1) (conj %1 %2) %1) [] (range 2 x))
  )
