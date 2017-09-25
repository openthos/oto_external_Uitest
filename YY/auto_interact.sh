#!/bin/bash
adb shell uiautomator runtest YY.jar -c com.autoTestUI.YY
sleep 10
adb shell pm uninstall -k com.duowan.pad
