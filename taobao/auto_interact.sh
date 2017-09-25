#!/bin/bash
adb shell uiautomator runtest taobao.jar -c com.autoTestUI.taobao
sleep 10
adb shell pm uninstall -k com.taobao.taobao
