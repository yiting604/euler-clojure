(ns euler.p4-test
  (:require [clojure.test :refer :all]
            [euler.p4 :refer :all]))

(deftest sum-square-power-test
  (testing "sum of square power of first 10 numbers is 385"
    (is (= 385 (sum-square-power 10)))))

(deftest square-power-sum-test
  (testing "square power of sum of first 10 numbers is 3025"
    (is (= 3025 (square-power-sum 10)))))
