(ns euler.p11
  (:gen-class)
  (:require
    [euler.grid :refer :all]
    [euler.seq :refer :all]
    [euler.file-utils :refer :all]
    )
  )

(defn n-max-row
  [n g]
  (apply max (map #(n-max n %) g))
  )

(defn n-max-line
  [n g]
  (max (n-max-row n g) (n-max-row n (rotate-90 g)) (n-max-row n (rotate-45 g)) (n-max-row n (-> g rotate-90 rotate-45)))
  )

(defn -main
  [& args]
  (process-csv-number-grid
    "p11.csv"
    #(println (n-max-line 4 %))
    )
  )
