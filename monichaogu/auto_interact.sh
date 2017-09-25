#!/bin/bash
adb shell uiautomator runtest monichaogu.jar -c com.autoTestUI.monichaoguTest1
sleep 10
adb shell pm uninstall -k com.hexin.plat.monitrade
