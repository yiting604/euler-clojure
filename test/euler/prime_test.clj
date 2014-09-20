(ns euler.prime-test
  (:require [clojure.test :refer :all]
            [euler.prime :refer :all]))

(deftest prime?-test
  (testing "5 is prime based on [2 3]"
    (is (true? (prime? 5 [2 3]))))
  (testing "6 is not prime based on [2 3]"
    (is (false? (prime? 6 [2 3]))))
  (testing "6 is prime based on []"
    (is (true? (prime? 6 []))))
  )

(deftest primes-under-test
  (testing "able to get primes under 5"
    (is (= [2 3 5] (primes-under 5))))
  (testing "able to get primes under 10"
    (is (= [2 3 5 7] (primes-under 10))))
  )

(deftest nth-prime-test
  (testing "1st prime is 2"
    (is (= 2 (nth-prime 1))))
  (testing "2nd prime is 3"
    (is (= 3 (nth-prime 2))))
  (testing "5th prime is 11"
    (is (= 11 (nth-prime 5))))
  )

(deftest factors-test
  (testing "able to get factors for 8"
    (is (= [2 2 2] (factors 8))))
  (testing "able to get factors for 7"
    (is (= [7] (factors 7))))
  (testing "able to get factors for 3"
    (is (= [3] (factors 3))))
  (testing "able to get factors for 120"
    (is (= [2 2 2 3 5] (factors 120))))
  )
