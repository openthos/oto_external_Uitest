#!/bin/bash
adb shell uiautomator runtest kindle.jar -c com.autoTestUI.kindle
sleep 10
adb shell pm uninstall -k com.amazon.kindle
