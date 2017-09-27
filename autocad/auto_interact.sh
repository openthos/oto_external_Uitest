#!/bin/bash
adb shell uiautomator runtest autocad.jar -c com.autoTestUI.autocadTest1
sleep 10
adb shell pm uninstall -k com.autodesk.autocadws
