(ns euler.p12-test
  (:require [clojure.test :refer :all]
            [euler.prime :refer :all]
            [euler.p12 :refer :all]
    ))

(deftest unique-factor-counts-test
  (testing "able to count unique factors for 24 [2 2 2 3]."
    (is (= [3 1] (unique-factor-counts 24 (primes-under 24)))))
  )

(deftest divisor-count-test
  (testing "divisor count for 28 is 6."
    (is (= 6 (divisor-count 28 (primes-under 28)))))
  (testing "divisor count for 15  is 4."
    (is (= 4 (divisor-count 15 (primes-under 15)))))
  )

(deftest first-divisible-triangular-test
  (testing "first divisible trangular number with 4 divisors is 6."
    (is (= 6 (first-divisible-triangular 4))))
  (testing "first divisible trangular number with 5 divisors is 28."
    (is (= 28 (first-divisible-triangular 5))))
  )
