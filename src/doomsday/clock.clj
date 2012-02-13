(ns doomsday.clock
  (:require [clj-http.client :as client]
            [pl.danieljanus.tagsoup :as soup]
            [clojure.xml :as xml]
            [clojure.zip :as zip]
            [clojure.core.memoize :as memo]))

(def clock-url "http://www.thebulletin.org/content/doomsday-clock/overview")

(defn ^:private load-page []
  (:body (client/get clock-url)))

(defn ^:private extract-minutes [s]
  (Integer/parseInt (second (re-find #"It is ([0-9]+) Minutes to Midnight"
                                     (load-page)))))

(def ttl-milliseconds (* 1000           ;1 Second
                         60             ;1 Minute
                         60             ;1 Hour
                         12             ;1/2 Day
                         ))

(defn minutes-to-midnight-uncached []
  (-> (load-page) extract-minutes))

(def minutes-to-midnight (memo/memo-ttl minutes-to-midnight-uncached ttl-milliseconds))
