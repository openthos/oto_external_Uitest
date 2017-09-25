#!/bin/bash
adb shell uiautomator runtest xiecheng.jar -c com.autoTestUI.xiecheng
sleep 10
adb shell pm uninstall -k ctrip.android.view
