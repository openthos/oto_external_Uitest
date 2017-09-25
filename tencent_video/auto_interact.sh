#!/bin/bash
adb shell uiautomator runtest tencent_video.jar -c com.autoTestUI.tencent_video
sleep 10
adb shell pm uninstall -k com.tencent.qqlive
