#!/bin/bash 
adb shell uiautomator runtest Yamaxun.jar -c com.autoTestUI.YamaxunTest1
sleep 10
adb shell pm uninstall -k com.amazon.windowshop
