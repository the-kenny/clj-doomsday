(ns doomsday.core
  (:require [doomsday.clock :as clock]))

(defn are-we-dead-yet? []
  (= 0 (clock/minutes-to-midnight)))
