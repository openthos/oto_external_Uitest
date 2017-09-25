#!/bin/bash
adb shell uiautomator runtest wpsemail.jar -c com.autoTestUI.wpsemail
sleep 10
adb shell pm uninstall -k com.kingsoft.email
