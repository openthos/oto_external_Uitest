#!/bin/bash 
adb shell uiautomator runtest tairui.jar -c com.autoTestUI.tairuiTest1
sleep 10
adb shell pm uninstall -k com.disney.WMPLite
