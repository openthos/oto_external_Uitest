#!/bin/bash
adb shell uiautomator runtest baiduyun.jar -c com.autoTestUI.baiduyun
sleep 10
adb shell pm uninstall -k com.baidu.netdisk
