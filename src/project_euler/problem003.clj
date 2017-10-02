(ns project-euler.problem003
  (:use [project-euler.helpers :refer :all]))

(defn problem003
  "The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?"
  [target]
  (reduce max (filter prime? (factors target))))
