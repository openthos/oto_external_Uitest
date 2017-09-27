#!/bin/bash 
adb shell uiautomator runtest pod.jar -c com.autoTestUI.podTest1
sleep 10
adb shell pm uninstall -k com.bambuna.podcastaddict
