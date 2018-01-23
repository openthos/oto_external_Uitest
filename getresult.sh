#!/bin/bash

cd "$(dirname "$0")"
android_ip=192.168.0.63
i=0
while (($i<10))
do
    sleep 1
    let "i++"
    echo $i
    adb connect $android_ip
    device=`adb devices | grep "\<device\>" | awk '{print $1}'`
if [ "$device" != "" ];then
    break
fi
done

date=`date +%Y%m%d%H%M`
./testgui.sh $android_ip 2>&1 | tee ./$date".log"

