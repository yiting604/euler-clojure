(ns euler.p5-test
  (:require [clojure.test :refer :all]
            [euler.p5 :refer :all]))

(deftest power-under-test
  (testing "2 power under 10 is 8."
    (is (= 8 (power-under 2 10))))
  (testing "3 power under 10 is 9."
    (is (= 9 (power-under 3 10))))
  (testing "5 power under 10 is 5."
    (is (= 5 (power-under 5 10)))))

(deftest smallest-multiple-test
  (testing "smallest multiple uner 10 is 2520."
    (is (= 2520 (smallest-multiple 10)))))
