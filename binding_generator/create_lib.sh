#!/bin/bash

. config

cd "$FIRM_HOME"
make firm # This should create the dynamic library
cd -

# Link it to our library dir
if test -e "$FIRM_BUILD/libfirm.so"; then
	ln -sf "$FIRM_BUILD/libfirm.so" ../lib
fi
if test -e "$FIRM_BUILD/libfirm.dylib"; then
	ln -sf "$FIRM_BUILD/libfirm.dylib" ../lib
fi
