#!/bin/bash 
adb shell uiautomator runtest sparkle.jar -c com.autoTestUI.sparkleTest1
sleep 10
adb shell pm uninstall -k com.the10tons.sparkle.free
