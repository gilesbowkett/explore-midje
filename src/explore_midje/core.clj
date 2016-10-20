(ns explore-midje.core)

(defn manual-flatten [something]
  (let [x  (first something)
        xs (rest something)]
    (cond (empty? something) nil
          (sequential? x)
            (concat (manual-flatten x) (manual-flatten xs))
          :else
            (cons x (manual-flatten xs)))))

