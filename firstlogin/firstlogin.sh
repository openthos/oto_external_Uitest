#!/bin/bash

localpwd=`pwd`
name=firstlogin

android create uitest-project -n $name -t 1 -p $localpwd
ant build
adb push $localpwd/bin/$name.jar /data/local/tmp
adb shell uiautomator runtest $name.jar -c com.$name.$name
rm -rf bin
rm build.xml local.properties  project.properties
