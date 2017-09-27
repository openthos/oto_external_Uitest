#!/bin/bash
adb shell uiautomator runtest cut.jar -c com.autoTestUI.cutTest1
sleep 10
adb shell pm uninstall -k com.zeptolab.ctr.ads
