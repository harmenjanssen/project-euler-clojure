(ns project-euler.problem005
  (:use [project-euler.helpers :refer :all]))

(defn divisible-by-all?
  "true if n is cleanly divisible by all numbers up to and including total"
  [total n]
  (every? (partial divisible? n) (range 1 (inc total))))

(defn problem005
  "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
  [n]
  (find-first (partial divisible-by-all? n) (iterate (partial + n) n)))
