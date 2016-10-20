(ns explore-midje.core)

(defn manual-flatten [something]
  (let [first-thing (first something)
        xs          (rest something)]
    (cond (empty? something) nil
          (sequential? first-thing)
            (concat (manual-flatten first-thing) (manual-flatten xs))
          :else
            (cons first-thing (manual-flatten xs)))))

