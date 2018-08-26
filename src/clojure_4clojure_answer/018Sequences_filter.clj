(ns clojure_4clojure_answer.018Sequences_filter)

(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))