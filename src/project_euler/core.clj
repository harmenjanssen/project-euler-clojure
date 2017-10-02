(ns project-euler.core)

; Note: I found the following over here: https://github.com/guillaume-nargeot/project-euler-clojure
; I liked it so much I stole it. Thanks @guillaume-nargeot!

(set! *warn-on-reflection* true)

(defn run-problem [n]
  (let [number (.format (new java.text.DecimalFormat "000") n)
        solution-function (symbol (str "problem" number))]
    (use (vec (list (symbol (str "project-euler.problem" number))
                    :only (list solution-function))))
    (eval (list solution-function))))

(defn -main
  "Solution runner"
  [& args]
  (if (and args (= 1 (count args)))
    (println (time (run-problem (Integer/parseInt (first args)))))
    (println "Usage: lein run [number]")))
