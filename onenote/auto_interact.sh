#!/bin/bash
adb shell uiautomator runtest onenote.jar -c com.autoTestUI.onenote
sleep 10
adb shell pm uninstall -k com.microsoft.office.onenote
