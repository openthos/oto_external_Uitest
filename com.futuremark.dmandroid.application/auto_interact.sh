#!/bin/bash
adb shell uiautomator runtest com.futuremark.dmandroid.application.jar -c com.autoTestUI.android3dmark
sleep 10
adb shell pm uninstall -k com.futuremark.dmandroid.application
