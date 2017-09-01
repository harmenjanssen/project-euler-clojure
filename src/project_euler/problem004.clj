(ns project-euler.problem004
  (:use [project-euler.helpers :refer :all]))

(defn palindrome?
  [n]
  (= (str n) (clojure.string/join (reverse (str n)))))

(def three-digit-products (for [x (range 100 999) y (range 100 999) :when (< x y)] (* x y)))

(defn problem004
  "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  Find the largest palindrome made from the product of two 3-digit numbers."
  []
  (reduce max (filter palindrome? three-digit-products)))
