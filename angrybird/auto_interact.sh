#!/bin/bash
adb shell uiautomator runtest angrybird.jar -c com.autoTestUI.angrybird
sleep 10
adb shell pm uninstall -k com.rovio.angrybirdsseasons
