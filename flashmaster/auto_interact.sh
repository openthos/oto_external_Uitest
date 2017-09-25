#!/bin/bash
adb shell uiautomator runtest flashmaster.jar -c com.autoTestUI.flashmaster
sleep 10
adb shell pm uninstall -k com.tako.flash.master
