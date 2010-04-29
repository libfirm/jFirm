#!/bin/bash
#
# You need a new version cparser (with jna backend) and firm headers

. config.${USER}

FIRM_INC=firm_headers

for i in lowering irgmod iredges irmode tv ircons irnode firm_common irdump iroptimize irgraph typerep ident irprog be irvrfy irflag irop irgopt irconsconfirm; do
	RES="../src/firm/bindings/binding_$i.java"
	TMP="/tmp/tmp.java"
	echo " * Creating $RES"
	echo cparser --print-jna -I${FIRM_INC} ${FIRM_INC}/libfirm/$i.h
	cparser --print-jna -I${FIRM_INC} ${FIRM_INC}/libfirm/$i.h > $TMP || exit $?
	sed -e "s/interface binding/interface binding_$i/g" -i $TMP
	echo "package firm.bindings;" > header
	cat header $TMP > $RES
done

