#!/bin/bash

. config

GOAL="../libfirm.so"
echo -e "#include <libfirm/firm.h>\nvoid __dummy__(void) { ir_get_version_major(); }" > /tmp/empty.c || exit $?
CMD="gcc -shared /tmp/empty.c -o ${GOAL} -I${FIRM_INC} ${FIRM_LFLAGS}"
echo $CMD
$CMD
