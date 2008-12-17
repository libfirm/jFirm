#!/bin/bash

. config

GOAL="../lib/libfirm.so"
cat > /tmp/dummy.c << __EOF__
#include <libfirm/firm.h>

void __dummy__(void) {
	ir_get_version_major();
	lower_highlevel(0);
}
__EOF__
CMD="gcc -shared /tmp/dummy.c -o ${GOAL} -I${FIRM_INC} ${FIRM_LFLAGS}"
echo $CMD
$CMD
