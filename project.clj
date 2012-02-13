(defproject clj-doomsday "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-http "0.3.2"]
                 [org.clojure/data.json "0.1.1"]
                 [clj-tagsoup "0.2.6" :exclusions [org.clojure/clojure
                                                   swank-clojure/swank-clojure]]
                 [org.clojure/core.memoize "0.5.1"]])
