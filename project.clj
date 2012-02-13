(defproject clj-doomsday "1.0.0-SNAPSHOT"
  :description "A simple library check if humanity has finally destroyed itself"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-http "0.3.2"]
                 [org.clojure/data.json "0.1.1"]
                 [clj-tagsoup "0.2.6" :exclusions [org.clojure/clojure
                                                   swank-clojure/swank-clojure]]
                 [org.clojure/core.memoize "0.5.1"]]
  :dev-dependencies [[midje "1.3.1"]
                     [lein-midje "1.0.7"]])
