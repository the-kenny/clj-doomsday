(ns doomsday.lhc
  (:require [clj-http.client :as client]))

(def lhc-url "http://hasthelargehadroncolliderdestroyedtheworldyet.com/")

(defn ^:private extract-answer [s]
  (second (re-find #"<noscript>(.+)</noscript>" s)))

(defn has-the-lhc-destroyed-the-world-yet? []
  (-> (:body (client/get lhc-url))
      (extract-answer)
      (not= "NOPE.")))
