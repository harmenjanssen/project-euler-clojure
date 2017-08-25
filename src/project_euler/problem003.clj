(ns project-euler.problem003)

(def target 600851475143N)

(defn divisible?
  [a b]
  (zero? (mod a b)))

(defn prime?
  [n]
  (and (> n 1) (not-any? #(divisible? n %) (range 2 n))))

(reduce max (take 10 (filter (and prime? #(divisible? target %)) (range 2 target))))

(defn problem003
  []
  (max )
