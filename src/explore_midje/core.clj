(ns explore-midje.core)

(defn manual-flatten [coll]
  (let [x  (first coll)
        xs (rest coll)]
    (cond (empty? coll) nil
          (sequential? x)
            (concat (manual-flatten x) (manual-flatten xs))
          (number? x)
            (cons x (manual-flatten xs)))))

