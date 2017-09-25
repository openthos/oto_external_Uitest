#!/bin/bash
adb shell uiautomator runtest IThome.jar -c com.autoTestUI.IThome
sleep 10
adb shell pm uninstall -k com.ruanmei.ithome
