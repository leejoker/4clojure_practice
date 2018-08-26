(ns clojure_4clojure_answer.011Maps_conj)

(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))
