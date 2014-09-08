(ns euler.p8-test
  (:require [clojure.test :refer :all]
            [euler.p8 :refer :all]))

(deftest n-product-test
  (testing "product of first 5 numbers in [1 2 3 4 5 6] is 120."
    (is (= 120 (n-product 5 [1 2 3 4 5 6]))))
  (testing "product of first 5 numbers in [1 2 3 4] is 24."
    (is (= 24 (n-product 5 [1 2 3 4]))))
  )

(deftest n-max-test
  (testing "max product of 3 numbers in a row in [1 2 3 4 5 6] is 120."
    (is (= 120 (n-max 3 [1 2 3 4 5 6]))))
  (testing "max product of 3 numbers in a row in [6 5 4 3 2 1] is 120"
    (is (= 120 (n-max 3 [6 5 4 3 2 1]))))
  )
