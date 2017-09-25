#!/bin/bash
adb shell uiautomator runtest tuniu.jar -c com.autoTestUI.tuniu
sleep 10
adb shell pm uninstall -k com.tuniu.HD.ui
