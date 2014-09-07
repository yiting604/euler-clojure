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
    (is (= [2 3] (primes-under 5))))
  (testing "able to get primes under 10"
    (is (= [2 3 5 7] (primes-under 10))))
  )

