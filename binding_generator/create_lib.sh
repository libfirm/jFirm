#!/bin/bash

. config"."${USER}

GOAL="../lib/${FIRM_TARGET_LIB}"
cat > /tmp/dummy.c << __EOF__
#include <libfirm/firm.h>

void __dummy__(void) {
	ir_init(NULL);
	ir_get_version_major();
	lower_highlevel(0);
}
__EOF__
CC=gcc
if which apgcc > /dev/null; then
	CC=apgcc
fi
CMD="$CC ${GCC_SHARED} /tmp/dummy.c -o ${GOAL} -I${FIRM_INC} ${FIRM_LFLAGS}"
echo $CMD
$CMD
