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

(deftest prime-factors-test
  (testing "able to get prime factors for 10"
    (is (= [2 5] (prime-factors 10))))
  (testing "able to get prime factors for 24"
    (is (= [2 3] (prime-factors 24))))
  (testing "able to get prime factors for 13195"
    (is (= [5 7 13 29] (prime-factors 13195))))
  )
