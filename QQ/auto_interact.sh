#!/bin/bash
adb shell uiautomator runtest QQ.jar -c com.autoTestUI.qq
sleep 10
adb shell pm uninstall -k com.tencent.mobileqq
