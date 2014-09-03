(ns euler.p3-test
  (:require [clojure.test :refer :all]
            [euler.p3 :refer :all]))

(deftest prime?-test
  (testing "5 is prime based on [2 3]"
    (is (true? (prime? 5 [2 3]))))
  (testing "6 is not prime based on [2 3]"
    (is (false? (prime? 6 [2 3]))))
  (testing "6 is prime based on []"
    (is (true? (prime? 6 []))))
  )

(deftest primes-test
  (testing "able to get primes under 5"
    (is (= [2 3] (primes 5))))
  (testing "able to get primes under 10"
    (is (= [2 3 5 7] (primes 10))))
  )

(deftest max-prime-factor-test
  (testing "able to get max prime factor for 10"
    (is (= 5 (max-prime-factor 10 2))))
  (testing "able to get max prime factor for 24"
    (is (= 3 (max-prime-factor 24 2))))
  (testing "able to get max prime factor for 13195"
    (is (= 29 (max-prime-factor 13195 2))))
  )
