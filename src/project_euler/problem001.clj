(ns project-euler.problem001)

(defn multiof [n, x] (zero? (mod x n)))

(defn problem001
  []
  (reduce + (filter (fn [x] (or (multiof 3 x) (multiof 5 x))) (range 1000))))

