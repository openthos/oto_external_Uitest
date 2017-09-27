#!/bin/bash 
adb shell uiautomator runtest weibo.jar -c com.autoTestUI.weiboTest1
sleep 10
adb shell pm uninstall -k com.sina.weibo
