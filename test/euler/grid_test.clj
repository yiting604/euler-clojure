(ns euler.grid-test
  (:require [clojure.test :refer :all]
            [euler.grid :refer :all]))

(deftest rotate-90-test
  (testing "able to rotate a 2x2 grid by 90 degree."
    (is (= [[:c :a] [:d :b]] (rotate-90 [[:a :b] [:c :d]]))))
  )

(deftest rotate-45-test
  (testing "able to rotate a 2x2 grid by 45 degree."
    (is (= [[:a] [:c :b] [:d]] (rotate-45 [[:a :b] [:c :d]]))))
  )

(deftest prefill-45-test
  (testing "able to prefill for 45 degree rotate."
    (is (= [[:a :b] [nil :c :d]] (prefill-45 [[:a :b] [:c :d]]))))
  )

(deftest clear-nils-test
  (testing "able to clear nils in grid."
    (is (= [[:a :b] [:c :d]] (clear-nils [[nil :a :b] [:c :d nil]]))))
  )

(deftest width-test
  (testing "width of [[:a] [:b] [:c :d]] is 2."
    (is (= 2 (width [[:a] [:b] [:c :d]]))))
  )

(deftest map-grid-test
  (testing "able to increase all cells by 1."
    (is (= [[2 3 4] [5 6 7]] (map-grid inc [[1 2 3] [4 5 6]]))))
  )
