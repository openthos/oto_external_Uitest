#!/bin/bash
adb shell uiautomator runtest wps.jar -c com.autoTestUI.wps
sleep 10
adb shell pm uninstall -k cn.wps.moffice_eng
