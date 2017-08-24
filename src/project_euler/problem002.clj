(ns project-euler.problem002)

(defn fibonacci
  "Generates fibonacci sequence"
  ([] (fibonacci 1 1))
  ([x y] (lazy-seq (cons x (fibonacci y (+ x y))))))

(defn fib-until
  [max]
  (take-while (fn [x] (< x max)) (fibonacci)))

(defn problem002
  []
  (reduce + (filter even? (fib-until 4000001))))
