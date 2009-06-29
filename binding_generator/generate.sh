#!/bin/bash

. config"."${USER}

# grab latest ir_spec
cp -puv ${FIRM_HOME}/libfirm/scripts/ir_spec.py .
cp -puv ${FIRM_HOME}/libfirm/scripts/spec_util.py .

rm -f *.java || exit $?
python generator.py || exit $?
mv ConstructionBase.java ../src/firm
mv Graph.java ../src/firm/Graph.java
mv *.java ../src/firm/nodes

