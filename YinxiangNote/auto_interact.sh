#!/bin/bash 
adb shell uiautomator runtest YinxiangNote.jar -c com.autoTestUI.YinxiangNoteTest1
sleep 10
adb shell pm uninstall -k com.evernote
