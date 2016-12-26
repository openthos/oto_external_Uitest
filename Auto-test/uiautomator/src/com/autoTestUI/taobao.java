package com.autoTestUI;

import java.io.IOException;
import android.os.RemoteException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class taobao extends UiAutomatorTestCase {
	public void testtaobao() throws UiObjectNotFoundException, RemoteException,
			IOException, InterruptedException{
		UiDevice device = getUiDevice();
		// wake up screen
		device.wakeUp();
		assertTrue("screen on :can't wakeup", device.isScreenOn());

		String appName = "com.taobao.apad/com.taobao.apad.activity.MainActivity";
		otoDisplayRun.execCmd("am start -n " + appName);
		
		boolean dumpFirstStart = new UiObject(new UiSelector().resourceId("com.taobao.taobao:id/title")).exists();
		
		if (dumpFirstStart == true) {
			UiObject cancelButton = new UiObject(new UiSelector().text("取消"));
			
			cancelButton.click();
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
