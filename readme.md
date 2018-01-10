# GUI自动化测试
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
# 环境搭建
## 安装ubuntu系统
版本无所谓，语言必须是英文
## 下载安装jdk

  - 下载地址:http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  
  - 选择下载版本:jdk-8u111-linux-x64.tar.gz
  
  - 解压文件:
 
  ```
  tar -zxvf jdk-8u111-linux-x64.tar.gz
  ```
  - 重命名文件并移动到/usr/lib下面: 
 
  ```
  mv jdk1.8.0_111 /usr/lib/jdk8
  ```
  - 配置环境变量
  ```
  sudo vi /etc/profile
  ```
  - 添加以下几行
  
  ```   
  export JAVA_HOME=/usr/lib/jdk8
  export JRE_HOME=$JAVA_HOME/jre    
  export CLASSPATH=.:$JAVA_HOME/lib:$JRE_HOME/lib 
  export PATH=$JAVA_HOME/bin:$PATH 
  ```  
  - 使配置生效
  
  ```
  source /etc/profile
  ```
  ```
  vi ~/.bashrc
  ```
  - 添加：
  ```
  source /etc/profile
  ```
  
  - 验证是否配置成功
  
  ```
  java -version
  ```
  出现jdk版本信息，则配置成功
  
  
## 安装adb
## 拷贝sdk
  ```
  scp lh@192.168.0.180:/home/lh/zlp/sdk.tar.gz .
  ```
## 配置环境变量
   ```
   sudo vi /etc/profile
   export PATH=$PATH:/sdk解压的目录/Sdk/tools:sdk解压的目录/Sdk/platform-tools:/sdk解压的目录/Sdk/tools/bin
```
   - 重启电脑
   - 验证是否成功
   ```
   android list target
   ```
   - 显示版本为22

## 安装ANT
```
sudo apt-get install ant
```

