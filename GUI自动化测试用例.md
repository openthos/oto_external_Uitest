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

## 关键代码
- otoDisplayRun.java 
  - 其中封装了鼠标的点击动作ClickById(String id)、ClickByText(String text)，Id和Text都可由uiautomatorviewer获取，也可用className;还有输入文字的方法SetTextByClassname(String cname,String text)，后续会随着测试用例的深入增加。
  - MoveToTop() 由于窗口最大化时标题栏会隐藏，所以通过调用MoveToTop()将标题栏调出，然后同时点击最小化、最大化和关闭等按钮
  - SolveProblems() 由于应用打开时，会出现广告窗口遮挡按钮的问题，所以当判定控件被遮挡时，则会调用SolveProblems()来关闭广告弹窗

- window_lib.java
  - 对窗口的测试流程为：向左拖拽窗口边框-->还原-->向右拖拽窗口边框-->还原-->移动窗口-->关闭
  - ```device.drag(myAppSide.left, myAppSide.top, myAppSide.left + 100,myAppSide.top, 2);```

## 通过脚本直接运行
https://github.com/openthos/oto_external_Uitest/blob/master/getresult.sh

## 基于LKP框架的测试用例(以微信为例)
  - 源码位置：https://github.com/openthos/oto_external_lkp/tree/master/testcase/wechat
    - 将编译过程从上述测试用例中拆分出来
    - 将原始结果的保存和后续处理剔除，按照LKP框架添加相关文件
  - 编译源码
    - [wechatMake.sh](https://github.com/openthos/oto_external_lkp/blob/master/testcase/wechat/wechatMake.sh)将源码编译为jar包
  - 处理原始结果
    - [wechat](https://github.com/openthos/oto_external_lkp/blob/master/lkp-tests-master/stats/wechat)将原始结果处理为wechat.result:1的形式
  - 可参考[LKP官方需要添加的文件（以下均以wechat为例）](https://github.com/openthos/oto_external_lkp/blob/master/testcase/AddTestcase.md)
