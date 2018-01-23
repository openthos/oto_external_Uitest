package com.firstlogin;

import android.os.RemoteException;
import android.view.KeyEvent;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class firstlogin extends UiAutomatorTestCase {
	public void testfirstlogin() throws UiObjectNotFoundException,RemoteException{
		otoDisplayRun otoTest;
		otoTest = new otoDisplayRun(getUiDevice());
		// wake up screen
		otoTest.mydevice.wakeUp();
		assertTrue("screen on :can't wakeup", otoTest.mydevice.isScreenOn());
	
		// 判断是否进入首次配置界面，如果是，选择语言为英文
		UiObject firstym= new UiObject (new UiSelector().resourceId("com.otosoft.setupwizard:id/title"));
	
		if (firstym.waitForExists(5000)) {
			otoTest.ClickById("com.otosoft.setupwizard:id/tv_english");
			sleep(1000);
		}
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_next");
		sleep(500);
		assertTrue("set English failed",new UiObject(new UiSelector().text("network settings")).exists());
	
		//点击返回，切换语言为中文
		otoTest.ClickById("com.android.settings:id/setup_wizard_navbar_back");
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_chinese");
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_next");
		sleep(1000);
		assertTrue("set Chinese failed",new UiObject(new UiSelector().text("网络设置")).exists());
		
		//网络设置
//		UiScrollable wifilist = new UiScrollable(new UiSelector().resourceId("android:id/list"));
//		UiObject wifi = wifilist.getChildByText(new UiSelector().resourceId("android.widget.TextView"), "Tsinghua");
//		wifi.click();
		sleep(1000);
		otoTest.ClickById("com.android.settings:id/ethernet_info");
		otoTest.ClickById("android:id/button1");
		otoTest.ClickById("com.android.settings:id/setup_wizard_navbar_next");
		
		//验证Openthos ID
		//注册
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_register");
		otoTest.mydevice.pressKeyCode(KeyEvent.KEYCODE_SHIFT_LEFT);
		otoTest.SetTextById("com.otosoft.setupwizard:id/edittext_openthos_id", "asptest@126.com");
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_register");
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_prev");
		//输入OpenthosID和密码并验证
		otoTest.SetTextById("com.otosoft.setupwizard:id/edittext_openthos_id", "asptest@126.com");
		otoTest.SetTextById("com.otosoft.setupwizard:id/edittext_openthos_password", "abc123");
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_verify");
		sleep(2000);
		
		//本机设置
		otoTest.SetTextById("com.otosoft.setupwizard:id/edittext_computer_name", "openthos");
		otoTest.SetTextById("com.otosoft.setupwizard:id/edittext_username","test");
		otoTest.ClickById("com.otosoft.setupwizard:id/tv_skip");
		otoTest.ClickById("android:id/button1");
		
		//等待安装应用
		sleep(50000);
		UiObject startuse = new UiObject(new UiSelector().resourceId("com.otosoft.setupwizard:id/button_start_use"));
		startuse.waitForExists(10000);
		//进入桌面
		otoTest.ClickById("com.otosoft.setupwizard:id/button_start_use");
		sleep(2000);

	}
}