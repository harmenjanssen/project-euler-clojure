(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.problem001 :refer [problem001]]
            [project-euler.problem002 :refer [problem002]]
            [project-euler.problem003 :refer [problem003]]))

(deftest all-solutions
  (testing "All solutions"
    (is (= 233168 (problem001)))
    (is (= 4613732 (problem002)))
    (is (= 6857 (problem003)))))
