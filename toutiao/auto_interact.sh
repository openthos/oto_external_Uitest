#!/bin/bash
adb shell uiautomator runtest toutiao.jar -c com.autoTestUI.toutiao
sleep 10
adb shell pm uninstall -k com.ss.android.article.news
