(ns more-macro-musings.core-test
  (:require #?(:clj  [clojure.test :refer [deftest is]]
               :cljs [cljs.test :refer-macros [deftest is]])
            [more-macro-musings.core #?(:clj :refer :cljs :refer-macros) [given]]))

(deftest given-macro-test
  (given {:foo "bar" :woo "baz"}
    :foo := "bar"
    :woo :!= "bar")
  (given 1
    inc := 2
    dec := 0
    dec :!= 1))
