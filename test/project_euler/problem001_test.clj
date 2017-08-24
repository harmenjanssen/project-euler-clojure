(ns project-euler.problem001-test
  (:require [clojure.test :refer :all]
            [project-euler.problem001 :refer :all]))

(deftest test001
  (testing "Problem 001"
    (is (= 233168 (problem001)))))
