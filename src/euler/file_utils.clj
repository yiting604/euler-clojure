(ns euler.file-utils
  (:gen-class)
  (:require
    [euler.grid :refer :all]
    [clojure.java.io :as io]
    [clojure.data.csv :as csv]
    )
  )

(defn read-csv-number-grid
  [in-file]
  (vec-grid (map-grid #(new Integer %) (csv/read-csv in-file)))
  )

(defn process-csv-number-grid
  [file-name f]
  (with-open [in-file (io/reader (io/resource file-name))]
    (doall
      (f (read-csv-number-grid in-file))
      )
    )
  )
