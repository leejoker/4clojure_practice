(ns clojure_4clojure_answer.019Last_Element)


(defn last-alpha [args]
	(let [a (first args)
		  b (rest args)]
		  (if (empty? b)
		  	a
		  	(recur b))))


(= (#(nth % (- (count %) 1)) [1 2 3 4 5]) 5)
(= (#(first (reverse %)) '(5 4 3)) 3)
(= (last-alpha ["b" "c" "d"]) "d")