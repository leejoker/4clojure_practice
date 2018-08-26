(ns clojure_4clojure_answer.015Double_Down)

(= ((fn [a] (* 2 a)) 2) 4)
(= (#(* 2 %) 3) 6)
(= (#(* 2 %) 11) 22)
(= (#(* 2 %) 7) 14)