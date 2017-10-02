(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.problem001 :refer [problem001]]
            [project-euler.problem002 :refer [problem002]]
            [project-euler.problem003 :refer [problem003]]
            [project-euler.problem004 :refer [problem004]]
            [project-euler.problem005 :refer [problem005]]
            [project-euler.problem006 :refer [problem006]]
  )
)

(deftest all-solutions
  (testing "All solutions"
    (is (= 233168 (problem001)))
    (is (= 4613732 (problem002)))
    (is (= 6857 (problem003)))
    (is (= 906609 (problem004)))
    (is (= 232792560 (problem005 20)))
    (is (= 25164150 (problem006 100)))
  )
)
