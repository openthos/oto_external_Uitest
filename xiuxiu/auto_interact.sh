#!/bin/bash
adb shell uiautomator runtest xiuxiu.jar -c com.autoTestUI.meitu
sleep 10
adb shell pm uninstall -k com.mt.mtxx.mtxx
