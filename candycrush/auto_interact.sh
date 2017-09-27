#!/bin/bash
adb shell uiautomator runtest candycrush.jar -c com.autoTestUI.candycrushTest1
sleep 10
adb shell pm uninstall -k com.king.candycrushsaga
