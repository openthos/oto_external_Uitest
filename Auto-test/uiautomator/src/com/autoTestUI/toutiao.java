package com.autoTestUI;

import java.io.IOException;
import android.os.RemoteException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class toutiao extends UiAutomatorTestCase {
	public void testtoutiao() throws UiObjectNotFoundException, RemoteException,
			IOException, InterruptedException{
		UiDevice device = getUiDevice();
		// wake up screen
		device.wakeUp();
		assertTrue("screen on :can't wakeup", device.isScreenOn());

		String appName = "com.ss.android.article.news/com.ss.android.article.news.activity.MainActivity";
		
		otoDisplayRun.execCmd("am start -n " + appName);
		
		boolean dumpFirstStart = new UiObject(new UiSelector().text("是否创建桌面快捷方式")).exists();
		
		if (dumpFirstStart == true) {
			UiObject sureButton = new UiObject(new UiSelector().text("确定"));
			
			sureButton.click();
		}
		
		window_lib.windowtest(device, appName);
		// start testing itself
		/*
		 * try { Runtime.getRuntime().exec( " am start -n " + appName);
		 * 
		 * } catch (IOException e) { // TODO auto-generated catch block
		 * e.printStackTrace(); } sleep(500);
		 */
	}

	
}
