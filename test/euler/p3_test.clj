(ns euler.p3-test
  (:require [clojure.test :refer :all]
            [euler.p3 :refer :all]))

(deftest max-prime-factor-test
  (testing "able to get max prime factor for 10"
    (is (= 5 (max-prime-factor 10 2))))
  (testing "able to get max prime factor for 24"
    (is (= 3 (max-prime-factor 24 2))))
  (testing "able to get max prime factor for 13195"
    (is (= 29 (max-prime-factor 13195 2))))
  )
