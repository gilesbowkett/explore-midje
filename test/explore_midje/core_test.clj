(ns explore-midje.core-test
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [explore-midje.core :refer :all]))

(fact "`return-hi-world` returns 'hello world'"
  (return-hi-world) => "hello world")

