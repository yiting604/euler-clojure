(ns euler.p7
  (:gen-class)
  (:require [euler.prime :refer :all]))

(defn -main
  [& args]
  (println (nth-prime 10001)))
