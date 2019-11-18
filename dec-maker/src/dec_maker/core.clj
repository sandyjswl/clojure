(ns dec-maker.core
  (:gen-class))


(defn dec-maker
[num]
(- num 1))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (dec-maker 200)))
