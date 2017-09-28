#!/bin/bash

cd "$(dirname "$0")"
android_ip=192.168.0.90

adb connect $android_ip
date=`date +%Y%m%d%H%M`

./testgui.sh $android_ip 2>&1 | tee ./$date".log"

