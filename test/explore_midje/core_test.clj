(ns explore-midje.core-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [explore-midje.core :refer :all]))

(fact "`manual-flatten` manually flattens"
  (manual-flatten [1 [2 3] 4]) => [1 2 3 4])

