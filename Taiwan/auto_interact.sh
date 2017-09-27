#!/bin/bash 
adb shell uiautomator runtest Taiwan.jar -c com.autoTestUI.TaiwanTest1
sleep 10
adb shell pm uninstall -k com.avector.itw.itwmj16hd
