#!/bin/bash

rm -f *.java || exit $?
python generator.py || exit $?
mv ConstructionBase.java ../src/firm
mv *.java ../src/firm/nodes

