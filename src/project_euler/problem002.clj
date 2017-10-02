(ns project-euler.problem002)

(defn fibonacci
  "Generates fibonacci sequence"
  ([] (fibonacci 1 1))
  ([x y] (lazy-seq (cons x (fibonacci y (+ x y))))))

(defn fib-until
  [max]
  (take-while (fn [x] (< x max)) (fibonacci)))

(defn problem002
  "Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
   1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
  [n]
  (reduce + (filter even? (fib-until (inc n)))))
