# Auto-test
1. 修改auto-test.java文件 androidTargetId

2. 根据android list查看本地id.如我本地为4  androidTargetId = "4";

3. 修改auto-test.java文件 IP地址（被测机的IP）
    eg:	// adb connect 192.168.0.105
		Runtime.getRuntime().exec("adb connect 192.168.0.105");
4.  以下部分为要测试的APP，注释选中行，则此应用不测试。
 static String[][] testClassFuncName = {
		{"com.autoTestUI.calc", "testcalc"},
		{ "com.autoTestUI.clock", "testclock" },
		{ "com.autoTestUI.date", "testdate" },
		{ "com.autoTestUI.email", "testemail" },
		{ "com.autoTestUI.adobe_acrobat_dc", "testadobe_acrobat_dc" },
		{ "com.autoTestUI.gdmap", "testgdmap" },
		{ "com.autoTestUI.microsoft_execl", "testmicrosoft_execl" },
		{ "com.autoTestUI.microsoft_onenote", "microsoft_onenote" },
		{ "com.autoTestUI.microsoft_outlook", "testmicrosoft_outlook" },
		{ "com.autoTestUI.microsoft_powerpoint", "testmicrosoft_powerpoint" },
		{ "com.autoTestUI.microsoft_word", "testmicrosoft_word" },
