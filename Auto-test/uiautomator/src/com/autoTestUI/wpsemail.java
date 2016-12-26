package com.autoTestUI;

import java.io.IOException;
import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class wpsemail extends UiAutomatorTestCase {
	public void testwpsemail() throws UiObjectNotFoundException, RemoteException,
			IOException, InterruptedException {
		UiDevice device = getUiDevice();
		// wake up screen
		device.wakeUp();
		assertTrue("screen on :can't wakeup", device.isScreenOn());

		String appName = "com.kingsoft.email/com.kingsoft.email.activity.setup.AccountSetupBasics";
		Runtime.getRuntime().exec("am start -n "+appName);
		Thread.sleep(2000);
		
		//input email username and passwd
		UiObject eaddress = new UiObject(new UiSelector().resourceId("com.kingsoft.email:id/account_email"));
		eaddress.click();
		eaddress.setText("asptest@126.com");
		sleep(500);
		
		UiObject passwd = new UiObject(new UiSelector().resourceId("com.kingsoft.email:id/account_password"));
		passwd.click();
		passwd.setText("abc123");
		sleep(500);
		
		UiObject signbtn = new UiObject(new UiSelector().resourceId("com.kingsoft.email:id/next"));
		signbtn.click();
		Thread.sleep(4000);
		
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
