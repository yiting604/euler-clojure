(ns euler.seq
  (:gen-class))

(defn n-product "product of first n numbers"
  [n v]
  (reduce * (take n v))
  )

(defn n-max "max product of n numbers in a row"
  [n v]
  (if (empty? v)
    0
    (max (n-product n v) (n-max n (rest v)))
    )
  )

(defn digit-seq
  [s]
  (map #(- (int %) 48) s)
  )