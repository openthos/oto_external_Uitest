#!/bin/bash
adb shell uiautomator runtest gugeinput.jar -c com.autoTestUI.gugeinput
sleep 10
adb shell pm uninstall -k com.google.android.inputmethod.pinyin
