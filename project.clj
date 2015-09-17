(defproject more-macro-musings "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]]
  :plugins [[lein-doo "0.1.4"]
            [lein-cljsbuild "1.0.6"]]
  :cljsbuild {
    :builds {:test {:source-paths ["src" "test"]
                    :compiler {:output-to "resources/public/js/testable.js"
                               :main 'more-macro-musings.runner
                               :optimizations :none}}
             :node-test {:source-paths ["src" "test"]
                         :compiler {:output-to "target/testable.js"
                                    :output-dir "target"
                                    :main 'more-macro-musings.runner
                                    :optimizations :none
                                    :hashbang false
                                    :pretty true
                                    :target :nodejs}}}})
