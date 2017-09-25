#!/bin/bash
adb shell uiautomator runtest esfilemanager.jar -c com.autoTestUI.esfilemanager
sleep 10
adb shell pm uninstall -k com.estrongs.android.pop
