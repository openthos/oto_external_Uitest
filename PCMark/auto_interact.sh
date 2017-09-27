#!/bin/bash
adb shell uiautomator runtest PCMark.jar -c com.autoTestUI.PCMarkTest1
sleep 10
adb shell pm uninstall -k com.futuremark.pcmark.android.benchmark
