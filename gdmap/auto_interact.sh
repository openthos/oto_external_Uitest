#!/bin/bash
adb shell uiautomator runtest gdmap.jar -c com.autoTestUI.gdmap
sleep 10
adb shell pm uninstall -k com.autonavi.minimap
