#!/bin/bash
##startmenuTest
echo 'startmenutest'
adb push StartMenuTest.apk /data/local/tmp/com.example.qin.startmenutest
adb shell pm install -r "/data/local/tmp/com.example.qin.startmenutest"
adb push StartMenuTest-androidTest.apk /data/local/tmp/com.example.qin.startmenutest.test
adb shell pm install -r "/data/local/tmp/com.example.qin.startmenutest.test"
adb shell am instrument -w -r -e debug false -e class com.example.qin.startmenutest.StartMenuTest1 com.example.qin.startmenutest.test/android.support.test.runner.AndroidJUnitRunner
adb shell pm uninstall com.example.qin.startmenutest

