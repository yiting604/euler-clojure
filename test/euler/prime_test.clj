(ns euler.prime-test
  (:require [clojure.test :refer :all]
            [euler.prime :refer :all]))

(deftest is-prime?-test
  (testing "5 is prime based on [2 3]"
    (is (true? (is-prime? 5 [2 3]))))
  (testing "6 is not prime based on [2 3]"
    (is (false? (is-prime? 6 [2 3]))))
  (testing "6 is prime based on []"
    (is (true? (is-prime? 6 []))))
  )

(deftest find-primes-under-test
  (testing "able to get primes under 5"
    (is (= [2 3 5] (find-primes-under 5))))
  (testing "able to get primes under 10"
    (is (= [2 3 5 7] (find-primes-under 10))))
  )

(deftest find-nth-prime-test
  (testing "1st prime is 2"
    (is (= 2 (find-nth-prime 1))))
  (testing "2nd prime is 3"
    (is (= 3 (find-nth-prime 2))))
  (testing "5th prime is 11"
    (is (= 11 (find-nth-prime 5))))
  )

(deftest find-factors-test
  (testing "able to get factors for 8"
    (is (= [2 2 2] (find-factors 8))))
  (testing "able to get factors for 7"
    (is (= [7] (find-factors 7))))
  (testing "able to get factors for 3"
    (is (= [3] (find-factors 3))))
  (testing "able to get factors for 120"
    (is (= [2 2 2 3 5] (find-factors 120))))
  )
