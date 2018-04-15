(ns project-euler.problem009
  (:use [project-euler.helpers :refer :all]))

; I couldn't do it 😭
; I messed around with lazy sequences containing triplets, but could not work it out that way.
;
; This solution comes from
; https://github.com/guillaume-nargeot/project-euler-clojure/blob/master/src/project_euler/problem_009.clj
(defn problem009
  "A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a^2 + b^2 = c^2

  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc."
  [n]
  (loop [a 1, b 2, c (- n 3)]
    (cond
      (= (+ (square a) (square b)) (square c)) (* a b c)
      (< c b) (recur (inc a) (+ a 2) (- n a 3))
      :default (recur a (inc b) (- n a b 1)))))
