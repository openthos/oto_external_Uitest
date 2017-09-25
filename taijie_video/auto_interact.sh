#!/bin/bash
adb shell uiautomator runtest taijie_video.jar -c com.autoTestUI.taijie_video
sleep 10
adb shell pm uninstall -k com.togic.livevideo
