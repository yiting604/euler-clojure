(ns euler.p6
  (:gen-class))

(defn factors
  [x, v]
  (filter #(= 0 (rem x %)) v)
  )

(defn three-digits?
  [x]
  (and (> x 99) (< x 1000))
  )

(defn opposite-factors "factor as opposite to 110~990"
  [x]
  (filter three-digits? (map #(/ x %) (factors x (map #(* % 11) (range 10 91)))))
  )

(defn palindrome-numbers
  []
  (for [a (range 9) b (range 10) c (range 10)] (+ (* (- 9 a) 100001) (* (- 9 b) 10010) (* (- 9 c) 1100)))
  )

(defn -main
  [& args]
  (println (take 1 (filter #(seq (opposite-factors %)) (palindrome-numbers))))
  )
