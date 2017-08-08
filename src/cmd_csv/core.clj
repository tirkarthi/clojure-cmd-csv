(ns cmd-csv.core
  (:require [clojure.string :refer [split]]
            [clojure.core.reducers :as r])
  (:gen-class))

(defn my-split
  [delimiter word]
  (loop [i 0
         words []]
    (let [end (.indexOf word delimiter i)]
      (if (= end -1)
        (conj words (subs word i (count word)))
        (recur (inc end) (conj words (subs word i end)))))))

(defn update-in!
  [map v]
  (let [v1 (nth v 1)
        v2 (nth v 2 0)
        prev (get map v1 0)]
    (assoc! map v1
            (if prev
              (+ prev
                 (Integer/parseInt v2))
              (Integer/parseInt v2)))))

(defn -main
  []
  (dotimes [i 3]
    (time
     (let [pattern (re-pattern #"\t")
          res-map (transient {})
          result (with-open [rdr (clojure.java.io/reader "sample.tsv")]
                   (doall
                    (->> (line-seq rdr)
                         (r/map #(split %1 pattern))
                         (r/reduce update-in! res-map)
                         persistent!)))]
      (if (empty? result)
        (println "No entries")
        (let [max-key (apply max-key #(second %1) result)
              max-value (get result max-key)]
          (println "max_key: " max-key " sum: " max-value)))))))
