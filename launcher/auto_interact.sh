#!/bin/bash
adb shell mkdir /sdcard/Pictures/awall/
adb push wallpaper.jpg /sdcard/Pictures/awall/
adb shell uiautomator runtest launcher.jar -c com.autoTestUI.launcher
