(defproject cmd-csv "0.1.0"
  :description "A simple CSV/TSV processing utility for benchmarking"
  :license {:name "MIT License"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/core.specs.alpha "0.1.10"]
                 [org.clojure/test.check "0.9.0"]]
  :main ^:skip-aot cmd-csv.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
