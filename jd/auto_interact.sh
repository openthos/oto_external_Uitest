#!/bin/bash
adb shell uiautomator runtest jd.jar -c com.autoTestUI.jd
sleep 10
adb shell pm uninstall -k com.jingdong.app.mall
