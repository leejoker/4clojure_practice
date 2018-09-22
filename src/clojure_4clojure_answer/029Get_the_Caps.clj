(ns clojure_4clojure_answer.029Get_the_Caps)

(= (__ "HeLlO, WoRlD!") "HLOWRD")
(empty? (__ "nothing"))
(= (__ "$#A(*&987Zf") "AZ")

#(apply str (re-seq #"[A-Z]" %))
