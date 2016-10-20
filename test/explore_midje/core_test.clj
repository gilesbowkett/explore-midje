(ns explore-midje.core-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [explore-midje.core :refer :all]))

(fact "`split` splits strings on regular expressions and returns a vector"
  (str/split "a/b/c" #"/") => ["a" "b" "c"]
  (str/split "" #"irrelevant") => [""]
  (str/split "no regexp matches" #"a+\s+[ab]") => ["no regexp matches"])

