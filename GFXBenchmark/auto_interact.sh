#!/bin/bash
adb shell uiautomator runtest GFXBenchmark.jar -c com.autoTestUI.GFXBenchmarkTest1
sleep 10
adb shell pm uninstall -k com.glbenchmark.glbenchmark27
