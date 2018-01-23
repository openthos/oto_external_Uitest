#!/bin/bash -x

localpwd=`pwd`
date=`date +%Y%m%d%H%M`
touch $date".result"
##跳过首次配置
./firstlogin/firstlogin.sh
## 默认运行全部测试用例
for testcase in `ls -d */|sed 's|[/]||g'`
##增删testlist中的用例名（即目录名称）选择部分测试用例
##testlist="com.futuremark.dmandroid.application"
##for testcase in $testlist
do
    cd $localpwd
    cd $testcase
    [ -f bin/$testcase".jar" ] && rm bin/$testcase".jar"
    android create uitest-project -n $testcase -t 1 -p .
    ant build
    adb push bin/$testcase".jar" /data/local/tmp
    adb install *.apk
    ./auto_interact.sh 2>&1 | tee tmpresult
    r=`cat tmpresult | grep -e "OK"`
    if [$r == ""]; then
      echo $testcase:0 >> ../$date".result"
    else
      echo $testcase:1 >> ../$date".result"
    fi
    rm tmpresult
    rm -rf bin
    rm build.xml local.properties  project.properties
done
