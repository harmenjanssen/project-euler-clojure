(ns project-euler.problem010
  (:use [project-euler.helpers :refer :all]))

(defn problem010
  "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  Find the sum of all the primes below two million."
  [n]
  (sum (filter prime? (range n))))

(problem010 10)
(problem010 2000000)
