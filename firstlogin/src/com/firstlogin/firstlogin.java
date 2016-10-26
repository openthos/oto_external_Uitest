package com.firstlogin;

import android.os.RemoteException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class firstlogin extends UiAutomatorTestCase {
	public void testfirstlogin() throws UiObjectNotFoundException,RemoteException{
		UiDevice device = getUiDevice();
		// wake up screen
		device.wakeUp();
		assertTrue("screen on :can't wakeup", device.isScreenOn());
	
		// 判断是否启动到第一次登录界面
		UiObject firstym= new UiObject (new UiSelector().resourceId("com.otosoft.setupwizard:id/title"));
		UiObject firstn = new UiObject(new UiSelector().resourceId("com.otosoft.setupwizard:id/tv_next"));
		
		if (firstym.waitForExists(5000)) {
		    firstn.click();
			sleep(1000);
		}
		UiObject openthosy =new UiObject(new UiSelector().text("Openthos ID"));
		UiObject first2n = new UiObject(new UiSelector().resourceId("com.otosoft.setupwizard:id/tv_skip"));
		if (openthosy.waitForExists(5000)) {
			first2n.click();
			sleep(1000);
		}		
		sleep(2000);
		first2n.click();
		UiObject endjm=new UiObject(new UiSelector().resourceId("com.otosoft.setupwizard:id/text_title_finish"));
		UiObject  first4n= new UiObject(new UiSelector().resourceId("com.otosoft.setupwizard:id/button_start_use"));
		if (endjm.waitForExists(5000)) {
			first4n.click();
			sleep(1000);
		}	

	}
}
