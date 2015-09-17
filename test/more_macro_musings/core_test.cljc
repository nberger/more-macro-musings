(ns more-macro-musings.core-test
  (:require [clojure.test :refer [deftest]]
            [more-macro-musings.core :refer [given]]))

(deftest given-macro-test
  (given {:foo "bar" :woo "baz"}
    :foo := "bar"
    :woo :!= "bar")
  (given 1
    inc := 2
    dec := 0
    dec :!= 1))
