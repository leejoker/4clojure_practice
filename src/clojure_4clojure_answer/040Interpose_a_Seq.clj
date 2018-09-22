(ns clojure_4clojure_answer.040Interpose_a_Seq)

(= (__ 0 [1 2 3]) [1 0 2 0 3])
(= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
(= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

(fn[reseq value seq1]
	(let [a (first seq1)
		  arest (rest seq1)]
		  (if (nil? a)
		  	reseq
		  	(if (empty? arest)
		  		(conj reseq a)
		  		(recur (conj reseq a value) value arest))))) []

(fn [sep xs]
  (drop-last (mapcat list xs (repeat sep))))
