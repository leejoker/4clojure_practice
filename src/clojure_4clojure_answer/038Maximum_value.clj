(ns clojure_4clojure_answer.038Maximum_value)

(= (__ 1 8 3 4) 8)
(= (__ 30 20) 30)
(= (__ 45 67 11) 67)

(fn [x & args]
	(loop [a x
		   b args]
		(let [args1 a
			  args2 b]
			(if (empty? args2)
				args1
				(recur (if (> args1 (first args2))
							args1
							(first args2)) (rest b))))))