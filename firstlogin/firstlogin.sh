#!/bin/bash

android create uitest-project -n firstlogin -t 1 -p .
ant build
adb push bin/firstlogin.jar /data/local/tmp
adb shell uiautomator runtest firstlogin.jar -c com.firstlogin.firstlogin
rm -rf bin
rm build.xml local.properties  project.properties
