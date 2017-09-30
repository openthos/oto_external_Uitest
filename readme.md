## GUI自动化测试
  - 修改getresult.sh中的IP地址为目标测试机的IP地址
  - 修改testgui.sh中`android create uitest-project -n $testcase -t 1 -p .`“-t”后面的数字
    - 使用`android list target`查看id，找到“Android 5.1.1"对应的id
```
Available Android targets:
----------
id: 1 or "android-22"
     Name: Android 5.1.1
     Type: Platform
     API level: 22
     Revision: 2
     Skins: HVGA, QVGA, WQVGA400, WQVGA432, WSVGA, WVGA800 (default), WVGA854, WXGA720, WXGA800, WXGA800-7in
 Tag/ABIs : default/x86_64
```
  - 执行./getresult.sh，在当前目录下可得到log和result两个文件
    - result中以“用例名：0/1”的形式展现测试结果，0表示测试失败，1表示测试通过
  - 如果只需要执行其中几个用例，可修改testgui.test中testlist，增删测试用例名称即可
```
##testlist="cntvhd clock "
##for testcase in $testlist
```
