#!/bin/bash

set -eu

. config

# grab latest ir_spec
cp -puv ${FIRM_HOME}/scripts/ir_spec.py .
cp -puv ${FIRM_HOME}/scripts/spec_util.py .

GENERATOR="python javagen.py tweaked_spec.py"
rm -f *.java || exit $?

for i in ConstructionBase.java Graph.java; do
	GOAL=../src/firm/$i
	echo "GEN $GOAL"
	$GENERATOR templates/$i > $GOAL
done
for i in NodeVisitor.java NodeWrapperConstruction.java; do
	GOAL=../src/firm/nodes/$i
	echo "GEN $GOAL"
	$GENERATOR templates/$i > $GOAL
done
$GENERATOR templates/Node.java -nodes
mv *.java ../src/firm/nodes
