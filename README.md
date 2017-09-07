# oto_Uitest
1. firstlogin
 - android create uitest-project -n firstlogin -t 4 -p /home/emindsoft/workspace/firstlogin/
 - ant build
 - adb connect ip
 - adb push bin/firstlogin.jar /data/local/tmp
 - adb shell uiautomator runtest firstlogin.jar -c com.firstlogin.firstlogin

2. mycomp
 - android create uitest-project -n mycomp -t 4 -p /home/emindsoft/workspace/mycomp/
 - ant build
 - adb connect ip
 - adb push bin/mycomp.jar /data/local/tmp
 - adb shell uiautomator runtest mycomp.jar -c com.mycomp.computer

