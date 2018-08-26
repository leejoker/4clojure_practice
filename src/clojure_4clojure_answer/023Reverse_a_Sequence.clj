(ns clojure_4clojure_answer.023Reverse_a_Sequence)

(= (__ [1 2 3 4 5]) [5 4 3 2 1])
(= (__ (sorted-set 5 7 2 7)) '(7 5 2))
(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

#(into () %)

(defn reverse_seq 
	[array se]
	(let [a (first array)
		  b (rest array)]
		  (if (empty? b)
		  	(conj se a)
		  	(recur b (conj se a)))))

(reverse_seq [1 2 3 4 5] '())