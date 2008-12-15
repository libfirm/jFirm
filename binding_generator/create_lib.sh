#!/bin/bash

. config

GOAL="../lib/libfirm.so"
cat > /tmp/dummy.c << __EOF__
#include <libfirm/firm.h>

void (*callback) (void);

void set_callback(void (*cb) (void)) {
	callback = cb;
}

void invoke() {
	printf("I'm in invoke\n");
	callback();
}

void __dummy__(void) { ir_get_version_major(); }
__EOF__
CMD="gcc -shared /tmp/dummy.c -o ${GOAL} -I${FIRM_INC} ${FIRM_LFLAGS}"
echo $CMD
$CMD
