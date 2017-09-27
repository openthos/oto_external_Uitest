#!/bin/bash 
adb shell uiautomator runtest Skype.jar -c com.autoTestUI.SkypeTest1
sleep 10
adb shell pm uninstall -k com.skype.raider
