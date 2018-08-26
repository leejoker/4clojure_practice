(ns clojure_4clojure_answer.024Sum_It_All_Up)

(= (__ [1 2 3]) 6)
(= (__ (list 0 -2 5 5)) 8)
(= (__ #{4 2 1}) 7)
(= (__ '(0 0 -1)) -1)
(= (__ '(1 10 3)) 14)


#(reduce + %)

(defn sum_all
	[array]
	(loop [a (first array)
		   b (rest array)
		   c 0]
		   (if (empty? b)
		   	(+ a c)
		   	(recur (first b) (rest b) (+ a c)))))