(ns euler.p9-test
  (:require [clojure.test :refer :all]
            [euler.p9 :refer :all]))

(deftest pythagorean-test
  (testing "3 4 5 is pythagorean"
    (is (true? (pythagorean? 3 4 5))))
  (testing "2 3 4 is not pythagorean"
    (is (false? (pythagorean? 2 3 4))))
  )
