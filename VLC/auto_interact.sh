#!/bin/bash
adb shell uiautomator runtest VLC.jar -c com.autoTestUI.VLC
sleep 10
adb shell pm uninstall -k org.videolan.vlc
