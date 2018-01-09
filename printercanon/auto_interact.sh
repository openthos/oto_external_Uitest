#!/bin/bash 
adb shell uiautomator runtest printercanon.jar -c com.autoTestUI.printercanonTest1
sleep 10
adb shell pm uninstall -k jp.co.canon.bsd.ad.pixmaprint
