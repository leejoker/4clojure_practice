(ns clojure_4clojure_answer.020Penultimate_Element)


(defn last-second-alpha [args]
	(let [a (first args)
		  b (rest args)]
		  (if (= 1 (count b))
		  	a
		  	(recur b))))

(= (#(nth % (- (count %) 2)) (list 1 2 3 4 5)) 4)
(= (#(second (reverse %)) ["a" "b" "c"]) "b")
(= (last-second-alpha [[1 2] [3 4]]) [1 2])