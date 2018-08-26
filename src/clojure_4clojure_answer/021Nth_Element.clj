(ns clojure_4clojure_answer.021Nth_Element)

(= (__ '(4 5 6 7) 2) 6)
(= (__ [:a :b :c] 0) :a)
(= (__ [1 2 3 4] 1) 2)
(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])


(defn nth-elem [s x]
  (last (take (inc x) s)))

;; 使用loop重新定义recur的位置，可以去掉h参数
(defn nth_element [args x h]
	(let [a (first args)
		  b (rest args)]
		  (if (= h x)
		  	a
		  	(recur b x (inc h)))))