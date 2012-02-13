(ns doomsday.test.core
  (:use doomsday.core
        midje.sweet)
  (require [doomsday.clock :as clock]))

(fact "about are-we-dead-yet?"
  (are-we-dead-yet?) => false
  (provided (clock/minutes-to-midnight) => 5)

  (are-we-dead-yet?) => true
  (provided (clock/minutes-to-midnight) => 0))
