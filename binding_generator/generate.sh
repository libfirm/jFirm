#!/bin/bash

rm -f *.java || exit $?
python generator.py || exit $?
mv ConstructionBase.java ../src/firm
mv Graph.java ../src/firm/Graph.java
mv *.java ../src/firm/nodes

