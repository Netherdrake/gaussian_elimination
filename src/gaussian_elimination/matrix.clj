(ns gaussian_elimination.matrix
  (use [gaussian_elimination.vector]))

(defn swap [m top bottom]
  (let [casted (vec m)]
  (assoc casted bottom (casted top) top (casted bottom))))

(defn replace-row [m idx new-row]
  (assoc m idx (vec new-row)))

(defn get-row [m idx]
  (m idx))

(defn get-col [m idx]
  (for [row m]
    (row idx)))

(defn add-col [m entries]
  (for [i (range (count m))]
    (conj (nth m i) (nth entries i))))