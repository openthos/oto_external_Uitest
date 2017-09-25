#!/bin/bash
adb shell uiautomator runtest powerpoint.jar -c com.autoTestUI.powerpoint
sleep 10
adb shell pm uninstall -k com.microsoft.office.powerpoint
