#!/bin/bash
adb shell uiautomator runtest cntvhd.jar -c com.autoTestUI.cntvhdTest
sleep 10
adb shell pm uninstall -k cn.cntvhd
