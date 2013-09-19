#!/bin/bash

. config

GOAL="../lib/${FIRM_TARGET_LIB}"
cat > /tmp/dummy.c << __EOF__
#include <libfirm/firm.h>

void __dummy__(void) {
	ir_init();
	ir_get_version_major();
	lower_highlevel();
}
__EOF__
CC=gcc
CMD="$CC ${GCC_SHARED} /tmp/dummy.c -o ${GOAL} -I${FIRM_INC} -I${FIRM_INC2} ${FIRM_LFLAGS} -lpthread -lm"
echo $CMD
$CMD
