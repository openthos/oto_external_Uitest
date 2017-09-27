#!/bin/bash
adb shell uiautomator runtest fotoFinder.jar -c com.autoTestUI.fotoFinderTest1
sleep 10
adb shell pm uninstall -k de.k3b.android.androFotoFinder
