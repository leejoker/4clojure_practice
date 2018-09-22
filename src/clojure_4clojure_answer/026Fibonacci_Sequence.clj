(ns clojure_4clojure_answer.026Fibonacci_Sequence)

(= (__ 3) '(1 1 2))
(= (__ 6) '(1 1 2 3 5 8))
(= (__ 8) '(1 1 2 3 5 8 13 21))

#(take % (map last(iterate (fn [[x y]] [y (+ x y)]) [0 1])))