(ns euler.p11-test
  (:require [clojure.test :refer :all]
            [euler.p11 :refer :all]))

(deftest n-max-row-test
  (testing "max product of 3 numbers in a row in [[1 2 3 4] [5 6 7 8]] is 336."
    (is (= 336 (n-max-row 3 [[1 2 3 4] [5 6 7 8]]))))
  )

(deftest n-max-line-test
  (testing "get max line product of 1 from row."
    (is (= 1 (n-max-line 3 [[0 0 0] [1 1 1] [0 0 0]]))))
  (testing "get max line product of 1 from col."
    (is (= 1 (n-max-line 3 [[0 1 0] [0 1 0] [0 1 0]]))))
  (testing "get max line product of 1 from slash."
    (is (= 1 (n-max-line 3 [[0 0 1] [0 1 0] [1 0 0]]))))
  (testing "get max line product of 1 from back-slash."
    (is (= 1 (n-max-line 3 [[1 0 0] [0 1 0] [0 0 1]]))))
  )
