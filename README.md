# PDDL/Clojure Interface (Standalone)

An interface between PDDL and Clojure using the bash shell. 

## Installation

Download from https://github.com/Pold87/pddl-clojure-interface-standalone.

Add the file `pci` to your $PATH.
Open `pci` in a text editor and set the variable `path` to the path of the jar file. 

## Usage

- Create: Add types to a list of entities and print the list
    pci create <file-with-names-of-entities> <type>

- Get: Get a PDDL block in a PDDL file and print the construct
    pci get <file> <block>

- Add a construct to a PDDL block and print the new domain/problem
    pci add <file> <block> <construct>

## License

Copyright © 2014 Volker Strobel

Distributed under the Eclipse Public License version 1.0.
