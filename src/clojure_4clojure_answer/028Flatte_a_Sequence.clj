(ns clojure_4clojure_answer.028Flatte_a_Sequence)

(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
(= (__ '((((:a))))) '(:a))

#(filter (complement sequential?) (tree-seq sequential? seq x))
