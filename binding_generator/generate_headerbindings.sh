#!/bin/bash
#
# You need a new version cparser (with jna backend) and firm headers

. config

for i in lowering irarch irdom irgmod iredges irmode tv ircons irnode firm_common irdump iroptimize irgraph typerep ident irprog be irverify irflag irop irgopt irconsconfirm irio irmemory; do
	RES="../src/firm/bindings/binding_$i.java"
	TMP="/tmp/tmp.java"
	echo " * Creating $RES"
	CMD="$CPARSER --print-jna --jna-libname firm -fvisibility=hidden -DFIRM_DLL -DFIRM_BUILD -I${FIRM_INC} -I${FIRM_INC2} ${FIRM_INC}/libfirm/$i.h --jna-limit ${FIRM_INC}/libfirm/$i.h"
	if [ $i = "irnode" -o $i = "ircons" ]; then
		CMD="$CMD --jna-limit ${FIRM_INC2}/nodes.h"
	fi
	echo "$CMD"
	$CMD > $TMP || exit $?
	echo "package firm.bindings;" > header
	echo "" >> header
	cat header > $RES
	cat $TMP | sed -e "s/class binding/class binding_$i/g" >> $RES
done

