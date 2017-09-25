#!/bin/bash
adb shell uiautomator runtest word.jar -c com.autoTestUI.microsoft_word
sleep 10
adb shell pm uninstall -k com.microsoft.office.word
