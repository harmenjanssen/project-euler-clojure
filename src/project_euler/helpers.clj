(ns project-euler.helpers
  (:use [clojure.math.numeric-tower :as math]))

(defn divisible?
  [a b]
  (zero? (mod a b)))

(defn factors
  [n]
  (filter (partial divisible? n) (range 1 (math/sqrt n))))

(defn prime?
  [n]
  (= 1 (count (factors n))))


