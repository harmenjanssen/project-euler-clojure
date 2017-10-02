(ns project-euler.helpers
  (:use [clojure.math.numeric-tower :as math]))

(defn lte
  [x y]
  (or (= x y) (< x y)))

(defn gte
  [x y]
  (or (= x y) (> x y)))

(gte 11 12)

(defn divisible?
  [a b]
  (zero? (mod a b)))

(defn- add-dual-factors
  "Conj two parts of a number's factor to the list.
  For instance: 2 is a factor of 24. When given 2 and 24, this function
  will add 2 and 12 to the list."
  [lst number factor]
  (conj (conj lst factor) (/ number factor)))

(defn factors
  "Lists a number's factors"
  [target]
  (loop [lst #{}
         n 1]
    (if (gte n (inc (math/ceil (math/sqrt target))))
      lst
      (recur
        (if (divisible? target n) (add-dual-factors lst target n) lst)
        (inc n)))))

(defn prime?
  [n]
  (= 2 (count (factors n))))

(defn square
  [n]
  (* n n))

(defn sum
  [numbers]
  (reduce + numbers))
