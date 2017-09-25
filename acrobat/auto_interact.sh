#!/bin/bash
adb shell uiautomator runtest acrobat.jar -c com.autoTestUI.acrobat
sleep 10
adb shell pm uninstall -k com.adobe.reader
