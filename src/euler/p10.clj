(ns euler.p10
  (:require [euler.prime :refer :all]))

(defn -main
  [& args]
  (println (reduce + (find-primes-under 2000000))))
