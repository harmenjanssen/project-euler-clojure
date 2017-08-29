(ns project-euler.problem003
  (:use [project-euler.helpers :refer :all]))

(defn palindrome?
  [n]
  (= (str n) (clojure.string/join (reverse (str n)))))

(defn 3-digit-products
  ([a b] (3-digit-products a b []))
  ([a b lst]
    (if (and (= a 999) (> 20 10))
      lst
      (cons (* a b) (3-digit-products (inc a) b lst))))

; NOTE: waarschijnlijk beter om achterstevoren te kijken, want het gaat om de hoogste,
; dus het eerste palindroom dat we vinden is de juiste?
; Tevens: je hoeft niet beide getallen helemaal af te lopen, want 100 * 999 is hetzelfde
; als 999 * 100

(take 100 (3-digit-products 100 100))

(defn problem003
  "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  Find the largest palindrome made from the product of two 3-digit numbers."
  []
  ())
