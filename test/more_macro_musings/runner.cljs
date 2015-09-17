(ns more-macro-musings.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [more-macro-musings.core-test]))

(doo-tests 'more-macro-musings.core-test)
