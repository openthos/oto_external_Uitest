#!/bin/bash
##startmenuTest
echo 'startmenutest'
adb -s $ip_android:$adbPort push StartMenuTest.apk /data/local/tmp/com.example.qin.startmenutest || { echo "push StartMenuTest.apk failed" ; exit 1 ; }
adb -s $ip_android:$adbPort shell pm install -r "/data/local/tmp/com.example.qin.startmenutest"
adb -s $ip_android:$adbPort push StartMenuTest-androidTest.apk /data/local/tmp/com.example.qin.startmenutest.test || { echo "push StartMenuTest-androidTest.apk failed" ; exit 1 ; }
adb -s $ip_android:$adbPort shell pm install -r "/data/local/tmp/com.example.qin.startmenutest.test"
adb -s $ip_android:$adbPort shell am instrument -w -r   -e debug false -e class com.example.qin.startmenutest.StartMenuTest1 com.example.qin.startmenutest.test/android.support.test.runner.AndroidJUnitRunner
adb -s $ip_android:$adbPort shell pm uninstall com.example.qin.startmenutest

