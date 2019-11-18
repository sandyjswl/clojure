(ns add-100.core
  (:gen-class))


(defn add100
  [num]
  (+ num 100))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (add100 1)))
