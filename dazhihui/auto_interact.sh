#!/bin/bash
adb shell uiautomator runtest dazhihui.jar -c com.autoTestUI.dazhihui
sleep 10
adb shell pm uninstall -k com.android.dazhihui
