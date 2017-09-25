#!/bin/bash
adb shell uiautomator runtest wpspro.jar -c com.autoTestUI.wpspro
sleep 10
adb shell pm uninstall -k com.kingsoft.moffice_pro
