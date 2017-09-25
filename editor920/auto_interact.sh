#!/bin/bash
adb shell uiautomator runtest editor920.jar -c com.autoTestUI.editor920
sleep 10
adb shell pm uninstall -k com.jecelyin.editor.v2
