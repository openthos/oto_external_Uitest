#!/bin/bash
adb shell uiautomator runtest xuetang.jar -c com.autoTestUI.xuetang
sleep 10
adb shell pm uninstall -k com.xuetangx.mobile
