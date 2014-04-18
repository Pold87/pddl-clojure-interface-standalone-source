(ns pddl-clojure-interface-standalone.core
  (:gen-class)
  (:require [clojure.tools.reader.edn :as edn]
            [clojure.java.io :as io]
            [pddl-clojure-interface.core :as pci]
            [fipp.edn :refer (pprint) :rename {pprint fipp}]))

(defn pprint-pddl
  "Pretty print PDDL constructs"
  [ls]
  (dorun
    (map #(fipp % {:width 85}) ls)))

(defn -main
  "Run the methods of the PDDL/Clojure interface in the bash shell"
  [& args]
  (let [[tool arg1 arg2 & rargs] args]
    (case tool
      ;; Create: Add types to a list of entities and print the list
      "create" (println (list* :types (pci/read-entities-and-add-type arg1  arg2)))
      ;; Get: Get a PDDL block in a PDDL file and print the construct
      "get" (pprint-pddl (pci/get-PDDL-construct arg1 arg2))
      ;; Add a construct to a PDDL block and print the extended domain/problem
      "add" (pprint-pddl (pci/add-part-to-PDDL arg1 arg2
                                               (read-string
                                                (str "(" (clojure.string/join #" " rargs) ")")))))))
