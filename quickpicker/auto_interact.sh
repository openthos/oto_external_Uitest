#!/bin/bash
adb shell uiautomator runtest quickpicker.jar -c com.autoTestUI.quickpicker
sleep 10
adb shell pm uninstall -k com.alensw.PicFolder
