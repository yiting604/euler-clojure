(ns euler.grid
  (:gen-class))

(defn width
  [g]
  (apply max (map count g))
  )

(defn rotate-90
  [g]
  (for [i (range (width g))]
    (reverse (map #(get % i) g))
    )
  )

(defn prefill-45
  [g]
  (for [i (range (count g))]
    (into (vec (replicate i nil)) (get g i))
    )
  )

(defn map-grid
  [f g]
  (map #(map f %) g)
  )

(defn vec-grid
  [g]
  (vec (map vec g))
  )

(defn clear-nils
  [g]
  (map (fn [v] (filter #(not (nil? %)) v)) g)
  )

(defn rotate-45
  [g]
  (-> g prefill-45 rotate-90 clear-nils)
  )
