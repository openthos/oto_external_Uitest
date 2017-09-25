#!/bin/bash
adb shell uiautomator runtest seafile.jar -c com.autoTestUI.seafile
sleep 10
adb shell pm uninstall -k com.seafile.seadroid2
