#!/bin/bash
adb shell uiautomator runtest yx_2048.jar -c com.autoTestUI.yx_2048
sleep 10
adb shell pm uninstall -k com.digiplex.game
