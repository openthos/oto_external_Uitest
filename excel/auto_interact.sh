#!/bin/bash
adb shell uiautomator runtest excel.jar -c com.autoTestUI.excel
sleep 10
adb shell pm uninstall -k com.microsoft.office.excel
