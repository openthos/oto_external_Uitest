#!/bin/bash
adb shell uiautomator runtest outlook.jar -c com.autoTestUI.outlook
sleep 10
adb shell pm uninstall -k com.microsoft.office.outlook
