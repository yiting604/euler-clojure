(ns euler.p1-test
  (:require [clojure.test :refer :all]
            [euler.p1 :refer :all]))

(deftest dividable-test
  (testing "5 is not dividable by 3."
    (is (false? (dividable 5 3))))
  (testing "6 is dividable by 3."
    (is (true? (dividable 6 3))))
  )
