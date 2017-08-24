(ns project-euler.problem002-test
  (:require [clojure.test :refer :all]
            [project-euler.problem002 :refer :all]))

(deftest test002
  (testing "Problem 002"
    (is (= 4613732 (problem002)))))
