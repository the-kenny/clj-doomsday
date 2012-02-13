(ns doomsday.core
  (:use [doomsday.clock :only [minutes-to-midnight]]
        [doomsday.lhc :only [has-the-lhc-destroyed-the-world-yet?]]))

(defn are-we-dead-yet? []
  (or (= 0 (minutes-to-midnight))
      (has-the-lhc-destroyed-the-world-yet?)))
