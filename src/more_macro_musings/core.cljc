(ns more-macro-musings.core
  (:require #?(:clj  [clojure.test :refer [is]]
               :cljs [cljs.test :refer-macros [is]])))

(defmacro given [v & body]
  `(do
     ~@(for [[a b c] (partition 3 body)]
         (case b
           := `(is (= (~a ~v) ~c))
           :!= `(is (not= (~a ~v) ~c))))))
