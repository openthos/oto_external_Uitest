#!/bin/bash
adb shell uiautomator runtest fm.jar -c com.autoTestUI.fm
sleep 10
adb shell pm uninstall -k com.ximalaya.ting.android
