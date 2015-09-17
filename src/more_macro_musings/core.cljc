(ns more-macro-musings.core
  (:require #?(:clj  [clojure.test]
               :cljs [cljs.test :include-macros true])))


(defn- cljs-env?
  "Take the &env from a macro, and tell whether we are expanding into cljs."
  [env]
  (boolean (:ns env)))

(defmacro if-cljs
  "Return then if we are generating cljs code and else for Clojure code.
   https://groups.google.com/d/msg/clojurescript/iBY5HaQda4A/w1lAQi9_AwsJ"
  [then else]
  (if (cljs-env? &env) then else))

(defmacro is [& args]
  `(if-cljs
     (cljs.test/is ~@args)
     (clojure.test/is ~@args)))

(defmacro given [v & body]
  `(do
     ~@(for [[a b c] (partition 3 body)]
         (case b
           := `(is (= (~a ~v) ~c))
           :!= `(is (not= (~a ~v) ~c))))))
