(ns euler.p6-test
  (:require [clojure.test :refer :all]
            [euler.p6 :refer :all]))

(deftest factors-test
  (testing "20 has factors 2 and 5"
    (is (= [2 4 5] (factors 20 [2 3 4 5 6 7]))))
  )

(deftest three-digits-test
  (testing "111 is three digits"
    (is (true? (three-digits? 111))))
  (testing "99 is not three digits"
    (is (false? (three-digits? 99))))
  )

(deftest opposite-factors-test
  (testing "101101 has opposite factor 707"
    (is (= [707] (opposite-factors 101101))))
  (testing "101102 does not opposite factor"
    (is (= [] (opposite-factors 101102))))
  )

(deftest palindrome-nubers-test
  (testing "gnerate palindrome numbers from top down"
    (is (= [999999 998899 997799 996699 995599 994499 993399 992299 991199 990099 989989] (take 11 (palindrome-numbers)))))
  )
