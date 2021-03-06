(ns doomsday.test.clock
  (:use doomsday.clock
        midje.sweet))

(defmacro timed [& expr]
  `(let [t# (System/currentTimeMillis)]
     (do ~@expr)
     (- (System/currentTimeMillis) t#)))

(fact "about timed"
  (timed (Thread/sleep 1000)) => (roughly 1000 10))

(fact "about minutes-to-midnight"
  (timed (minutes-to-midnight)) => pos?  ;Uncached, slow (> 1 millisecond)
  (timed (minutes-to-midnight)) => 0     ;Cached, fast
  (minutes-to-midnight)         => integer?
  (minutes-to-midnight)         => (roughly 5 5)
  )
