(ns explore-midje.core)

(defn manual-flatten [array]
  (let [x  (first array)
        xs (rest array)]
    (cond (empty? array) nil
          (sequential? x)
            (concat (manual-flatten x) (manual-flatten xs))
          (number? x)
            (cons x (manual-flatten xs)))))

