#!/bin/bash 
adb shell uiautomator runtest printerepson.jar -c com.autoTestUI.printerepsonTest1
sleep 10
adb shell pm uninstall -k epson.print
