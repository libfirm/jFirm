#!/bin/bash

set -eu

. config

GENERATOR="python ${FIRM_HOME}/scripts/gen_ir.py tweaked_spec.py -I."
rm -f *.java || exit $?

for i in ConstructionBase.java Graph.java; do
	GOAL=../src/firm/$i
	echo "GEN $GOAL"
	$GENERATOR templates/$i > $GOAL
done
for i in NodeVisitor.java Nodes.java; do
	GOAL=../src/firm/nodes/$i
	echo "GEN $GOAL"
	$GENERATOR templates/$i > $GOAL
done

$GENERATOR templates/nodelist > /tmp/nodelist
for n in $(cat /tmp/nodelist); do
	GOAL="../src/firm/nodes/$n.java"
	echo "GEN $GOAL"
	$GENERATOR -DNODENAME=$n templates/Node.java > $GOAL
done
