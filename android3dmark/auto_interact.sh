#!/bin/bash
adb shell uiautomator runtest android3dmark.jar -c com.autoTestUI.android3dmark
sleep 10
adb shell pm uninstall -k com.futuremark.dmandroid.application
