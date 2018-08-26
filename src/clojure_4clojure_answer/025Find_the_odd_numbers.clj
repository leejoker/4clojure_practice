(ns clojure_4clojure_answer.025Find_the_odd_numbers)

(= (__ #{1 2 3 4 5}) '(1 3 5))
(= (__ [4 2 1 6]) '(1))
(= (__ [2 2 4 6]) '())
(= (__ [1 1 1 3]) '(1 1 1 3))

#(filter odd? %)


(defn ifodds [c a]
	(if (odd? a)
		(conj c a)
		c))

(defn find_odd 
	[numbers]
	(loop [a (first numbers)
		   b (rest numbers)
		   c []]
		   (if (empty? b)
		   	 (ifodds c a)
		   	 (recur (first b) (rest b) (ifodds c a)))))
