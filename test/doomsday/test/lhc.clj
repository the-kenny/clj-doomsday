(ns doomsday.test.lhc
  (:use doomsday.lhc
        midje.sweet))

(fact
  (has-the-lhc-destroyed-the-world-yet?) => (instance? java.lang.Boolean))
