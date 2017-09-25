#!/bin/bash
adb shell uiautomator runtest OSmonitor.jar -c com.autoTestUI.OSmonitor
sleep 10
adb shell pm uninstall -k com.eolwral.osmonitor
