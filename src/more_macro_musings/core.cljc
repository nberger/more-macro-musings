(ns more-macro-musings.core
  (:require #?(:clj  [clojure.test :as test :refer [is]]
               :cljs [cljs.test :as test :refer-macros [is]])))

(defmacro given [v & body]
  `(do
     ~@(for [[a b c] (partition 3 body)]
         (case b
           := `(test/is (= (~a ~v) ~c))
           :!= `(test/is (not= (~a ~v) ~c))))))
