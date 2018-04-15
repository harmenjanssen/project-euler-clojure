(ns project-euler.helpers
  (:use [clojure.math.numeric-tower :as math]))

(defn lte
  [x y]
  (or (= x y) (< x y)))

(defn gte
  [x y]
  (or (= x y) (> x y)))

(defn divisible?
  [a b]
  (zero? (mod a b)))

(defn dual-factors
  "Conj two parts of a number's factor to a set.
  For instance: 2 is a factor of 24. When given 2 and 24, this function
  will add 2 and 12 to the list."
  [number factor]
  (set [factor (/ number factor)]))

(defn factors
  "Lists a number's factors, lazily"
  ([target] (factors 1 target))
  ([n target]
   (when (< n (inc (math/ceil (math/sqrt target))))
    (lazy-seq
        (if (divisible? target n)
          (distinct (concat (dual-factors target n) (factors (inc n) target)))
          (factors (inc n) target))))))

(defn prime?
  "Checks wether a number is prime.
  Note that it does so by taking the first 3 factors of the number and checking wether it got only 2.
  I think this is a bit dumb but I don't know how to count a lazy-seq and stop counting after the
  second item."
  [n]
  (= 2 (count (take 3 (factors n)))))

(defn square
  [n]
  (* n n))

(defn sum
  [numbers]
  (reduce + numbers))

(defn find-first
  [f coll]
  (first (filter f coll)))
