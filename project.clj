(defproject clj-doomsday "0.1-SNAPSHOT"
  :description "A simple library check if humanity has finally destroyed itself"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-http "0.3.2"]
                 [org.clojure/core.memoize "0.5.1"]]
  :dev-dependencies [[midje "1.3.1"]]
  ;; Global exclusions to absolutely prevent deps-errors
  ;; Needed by Travis. See: http://about.travis-ci.org/docs/user/languages/clojure/
  :exclusions [org.clojure/clojure
               swank-clojure/swank-clojure]
  )
