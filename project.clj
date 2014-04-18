(defproject pddl-clojure-interface-standalone "1.0.0"
  :description "Interface between PDDL and Clojure (Standalone for the command-line)"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.reader "0.8.3"]
                 [pddl-clojure-interface "1.0.4"]
                 [fipp "0.4.1"]]
  :main ^:skip-aot pddl-clojure-interface-standalone.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
