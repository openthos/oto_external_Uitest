#!/bin/bash
adb shell uiautomator runtest wechat.jar -c com.autoTestUI.wechat
sleep 10
adb shell pm uninstall -k com.tencent.mm
