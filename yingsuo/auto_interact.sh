#!/bin/bash 
adb shell uiautomator runtest yingsuo.jar -c com.autoTestUI.yingsuoTest1
sleep 10
adb shell pm uninstall -k com.github.shadowsocks
