(ns project-euler.problem006
  (:use [project-euler.helpers :refer :all]))

(defn square-of-sum
  [n]
  (square (sum (range 1 (inc n)))))

(defn sum-of-squares
  [n]
  (sum (map square (range 1 (inc n)))))

(defn problem006
  "The sum of the squares of the first ten natural numbers is,

    1^2 + 2^2 + ... + 10^2 = 385

  The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)^2 = 55^2 = 3025

  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum."
  [n]
  (- (square-of-sum n) (sum-of-squares n)))

(problem006 100)
