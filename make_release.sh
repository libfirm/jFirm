#!/bin/bash

VERSION="0.1.0"
WORKDIR="release"
RELEASEDIR="jfirm-$VERSION"
FULLRELEASEDIR="$WORKDIR/$RELEASEDIR"
RELEASEFILE="jfirm-$VERSION.zip"

rm -rf "$FULLRELEASEDIR"

echo "Preparing $FULLRELEASEDIR"
mkdir -p "$WORKDIR"
mkdir -p "$FULLRELEASEDIR"

find src -name "*.java" -exec cp -p --parents "{}" "$FULLRELEASEDIR" ';'

SINGLE_FILES="README lib/libfirm.so lib/libfirm.dylib"
for f in $SINGLE_FILES; do
	cp -p --parents "$f" "$FULLRELEASEDIR"
done

echo "create $RELEASEFILE"
pushd $WORKDIR > /dev/null
zip -9r "$RELEASEFILE" "$RELEASEDIR"
popd > /dev/null
