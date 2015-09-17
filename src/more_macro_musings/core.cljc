(ns more-macro-musings.core
  (:require #?(:clj  [clojure.test :refer [is]]
               :cljs [cljs.test :refer-macros [is]])))

(defmacro given [v & body]
  `(do
     ~@(for [[a b c] (partition 3 body)]
         (case b
           := `(#?(:clj clojure.test/is :cljs cljs.test/is) (= (~a ~v) ~c))
           :!= `(#?(:clj clojure.test/is :cljs cljs.test/is) (not= (~a ~v) ~c))))))
