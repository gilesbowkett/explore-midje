(ns explore-midje.core-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [explore-midje.core :refer :all]))

(fact "`manual-flatten` manually flattens arrays"
  (manual-flatten [1 [2 3] 4]) => [1 2 3 4]
  (manual-flatten [1 [2 [3 [4]]]]) => [1 2 3 4]
  (manual-flatten [1]) => [1])

(fact "`manual-flatten` also works on maps"
  (manual-flatten {1 2 3 4}) => [1 2 3 4])

