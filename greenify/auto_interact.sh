#!/bin/bash
adb shell uiautomator runtest greenify.jar -c com.autoTestUI.greenify
sleep 10
adb shell pm uninstall -k com.oasisfeng.greenify
