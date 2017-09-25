#!/bin/bash
adb shell uiautomator runtest wymusic.jar -c com.autoTestUI.wyiyunmusic
sleep 10
adb shell pm uninstall -k com.netease.cloudmusic
