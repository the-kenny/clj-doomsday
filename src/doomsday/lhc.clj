(ns doomsday.lhc
  (:require [clj-http.client :as client]
            [clojure.core.memoize :as memo]))

(def lhc-url "http://hasthelargehadroncolliderdestroyedtheworldyet.com/")

(defn ^:private extract-answer [s]
  (second (re-find #"<noscript>(.+)</noscript>" s)))

(defn has-the-lhc-destroyed-the-world-yet?-uncached []
  (-> (:body (client/get lhc-url))
      (extract-answer)
      (not= "NOPE.")))

(def ttl-milliseconds (* 1000           ;1 Second
                         60             ;1 Minute
                         60             ;1 Hour
                         12             ;1/2 Day
                         ))

(def has-the-lhc-destroyed-the-world-yet?
  (memo/memo-ttl has-the-lhc-destroyed-the-world-yet?-uncached ttl-milliseconds))
