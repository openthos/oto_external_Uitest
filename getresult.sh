#!/bin/bash

cd "$(dirname "$0")"
android_ip=192.168.0.64

date=`date +%Y%m%d`

./testgui.sh $android_ip 2>&1 | tee ./$date".log"

