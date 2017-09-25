#!/bin/bash
adb shell uiautomator runtest czfilemanager.jar -c com.autoTestUI.czfilemanager
sleep 10
adb shell pm uninstall -k com.chaozhuo.filemanager
