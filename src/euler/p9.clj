(ns euler.p9
  (:gen-class))

(defn candidates
  [d]
  (for [anb (range (/ d 2) (/ (* d 2) 3)) a (range 1 (/ anb 2))]
    [a (- anb a) (- d anb)]
    )
  )

(defn pythagorean?
  [a b c]
  (= (* c c) (+ (* a a) (* b b)))
  )

(defn -main
  [& args]
  (println (map #(reduce * %) (filter #(apply pythagorean? %) (candidates 1000))))
  )
