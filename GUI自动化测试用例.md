# 自动测试-GUI的自动测试用例

## 使用uiautomator进行UI测试
  - 基于java，一次编译可以运行于所有设备
  - 接口丰富，覆盖所有android操作

## uiautomatorviewer分析UI控件的属性
  - 在sdk/tools下启动uiautomatorviewer
  - 获取运行截图
  - 在截图中选择控件，右侧可以看到相对应的属性
 
## 新建测试用例
  - 用Eclipse创建Java Project
  - 添加JUnit库
  - 添加android-sdk-platforms下对应android版本的android.jar和uiautomator.jar
  - 在src中添加包和class文件，开始编写测试用例

##基于LKP框架的测试用例(以微信为例)
  - 源码位置：https://github.com/openthos/oto_external_lkp/tree/master/testcase/wechat
    - 将编译过程从上述测试用例中拆分出来
    - 将原始结果的保存和后续处理剔除，按照LKP框架添加相关文件
  - 编译源码
    - [wechatMake.sh](https://github.com/openthos/oto_external_lkp/blob/master/testcase/wechat/wechatMake.sh)将源码编译为jar包
  - 处理原始结果
    - [wechat](https://github.com/openthos/oto_external_lkp/blob/master/lkp-tests-master/stats/wechat)将原始结果处理为wechat.result:1的形式
  - 可参考[LKP官方需要添加的文件（以下均以wechat为例）](https://github.com/openthos/oto_external_lkp/blob/master/testcase/AddTestcase.md)
