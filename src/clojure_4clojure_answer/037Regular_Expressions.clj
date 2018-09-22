(ns clojure_4clojure_answer.037Regular_Expressions)

(= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

"ABC"