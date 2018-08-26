(ns clojure_4clojure_answer.dbg)

(defmacro dbg[x] `(let [x# ~x] (println "dbg:" '~x "=" x#) x#))