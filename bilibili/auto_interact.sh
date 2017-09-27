#!/bin/bash
adb shell uiautomator runtest bilibili.jar -c com.autoTestUI.bilibiliTest1
sleep 10
adb shell pm uninstall -k tv.danmaku.bili
