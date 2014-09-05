(ns euler.p5
  (:gen-class)
  (:require [euler.prime :refer :all]))

(defn power-under
  [x, n]
  (last (take-while (partial > n) (iterate #(* % x) 1)))
  )

(defn smallest-multiple
  [n]
  (reduce * (map #(power-under % n) (primes n))))

(defn -main
  [& args]
  (println (smallest-multiple 20)))
