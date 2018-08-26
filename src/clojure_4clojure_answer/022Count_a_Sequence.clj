(ns clojure_4clojure_answer.022Count_a_Sequence)

(= (__ '(1 2 3 3 1)) 5)
(= (__ "Hello World") 11)
(= (__ [[1 2] [3 4] [5 6]]) 3)
(= (__ '(13)) 1)
(= (__ '(:a :b :c)) 3)

#(reduce + (map (fn [x] 1) %))

(defn count_elem
	[array x]
	(let [a (first array)
		  b (rest array)]
		  (if (empty? b)
		  	(inc x)
		  	(recur b (inc x)))))