#!/bin/bash
packagename=$1
adb shell uiautomator runtest $packagename.jar -c com.autoTestUI.android3dmark
sleep 10
adb shell pm uninstall -k $packagename
