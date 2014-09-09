(ns euler.p10
  (:gen-class)
  (:require [euler.prime :refer :all]))

(defn -main
  [& args]
  (println (reduce + (primes-under 2000000))))
