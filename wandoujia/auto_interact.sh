#!/bin/bash
adb shell uiautomator runtest wandoujia.jar -c com.autoTestUI.wandoujia
sleep 10
adb shell pm uninstall -k com.wandoujia.phoenix2
