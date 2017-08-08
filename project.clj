(defproject cmd-csv "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/core.specs.alpha "0.1.10"]
                 [org.clojure/test.check "0.9.0"]]
  :main ^:skip-aot cmd-csv.core
  :target-path "target/%s"
  ;; :jvm-opts ["-Dcom.sun.management.jmxremote"
  ;;            "-Dcom.sun.management.jmxremote.ssl=false"
  ;;            "-Dcom.sun.management.jmxremote.authenticate=false"
  ;;            "-Dcom.sun.management.jmxremote.port=43210"]
  :profiles {:uberjar {:aot :all}})
