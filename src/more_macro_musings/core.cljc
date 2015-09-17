(ns more-macro-musings.core
  (:require [clojure.test :refer [is]]))

(defmacro given [v & body]
  `(do
     ~@(for [[a b c] (partition 3 body)]
         (case b
           := `(is (= (~a ~v) ~c))
           :!= `(is (not= (~a ~v) ~c))))))
