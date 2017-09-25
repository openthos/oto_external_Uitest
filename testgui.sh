#!/bin/bash

localpwd=`pwd`
adb connect 192.168.0.63
for testcase in `ls -d */|sed 's|[/]||g'`
do
    cd $localpwd
    cd $testcase
    [ -f bin/$testcase".jar" ] && rm bin/$testcase".jar"
    android create uitest-project -n $testcase -t 1 -p .
    ant build
    adb push bin/$testcase".jar" /data/local/tmp
    adb install *.apk
    ./auto_interact.sh
done

