(ns clojure_4clojure_answer.039Interleave_Two_Seqs)

(= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
(= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
(= (__ [1 2 3 4] [5]) [1 5])
(= (__ [30 20] [25 15]) [30 25 20 15])


(fn [reseq seq1 seq2]
	(let [a (first seq1)
		  arest (rest seq1)
		  b (first seq2)
		  brest (rest seq2)]
		  (if (nil? a)
		  	reseq
		  	(if (nil? b)
		  		reseq
		  		(recur (conj reseq a b) arest brest)))
		  )) []


mapcat #(list %1 %2)
mapcat list
mapcat vector