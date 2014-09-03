(ns euler.p2-test
  (:require [clojure.test :refer :all]
            [euler.p2 :refer :all]))

(deftest fib-test
  (testing "able to generate first 6 fibs"
    (is (= [1 1 2 3 5 8] (take 6 (fib 1 0)))))
  )
  
(deftest fib-under-test
  (testing "able to generate fibs under 5"
    (is (= [1 1 2 3] (fib-under 5))))
  (testing "able to generate fibs under 10"
    (is (= [1 1 2 3 5 8] (fib-under 10))))
  )

(deftest sum-even-fibs-test
  (testing "able to sum even fibs under 5"
    (is (= 2 (sum-even-fibs 5))))
  (testing "able to sum even fibs under 10"
    (is (= 10 (sum-even-fibs 10))))
  )