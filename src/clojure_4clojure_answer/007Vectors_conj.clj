(ns clojure-4clojure-answer.007Vectors-conj)


(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 4 4] (conj [1 2] 3 4))