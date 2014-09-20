(ns euler.p12-test
  (:require [clojure.test :refer :all]
            [euler.p12 :refer :all]))

(deftest unique-factor-counts-test
  (testing "able to count unique factors for 7 8."
    (is (= [1 2] (unique-factor-counts 7 8))))
  )

(deftest divisor-count-test
  (testing "divisor count for 28 (7 * 8 / 2) is 6."
    (is (= 6 (divisor-count 7 8))))
  (testing "divisor count for 15 (5 * 6 / 2) is 4."
    (is (= 4 (divisor-count 5 6))))
  )

(deftest first-divisible-triangular-test
  (testing "first divisible trangular number with 4 divisors is 6."
    (is (= 6 (first-divisible-triangular 4))))
  (testing "first divisible trangular number with 5 divisors is 28."
    (is (= 28 (first-divisible-triangular 5))))
  )
