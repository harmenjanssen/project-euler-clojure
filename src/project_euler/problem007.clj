(ns project-euler.problem007
  (:use [project-euler.helpers :refer :all]))


(defn nth-prime
  [n]
  (loop [primes 0
         last-prime 0
         i 1]
    (let [is-prime (prime? i)]
      (if (= primes n)
        last-prime
        (recur (if is-prime (inc primes) primes)
               (if is-prime i last-prime)
               (inc i))))))

(defn problem007
  "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
  What is the 10001st prime number?"
  [n]
  (nth-prime n))
