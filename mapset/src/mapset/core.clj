(ns mapset.core
  (:gen-class))

(defn mapset
  [function values]
  (into #{} (map function values))
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (mapset inc [1 1 2 2])))
