package com.autoTestUI;

import java.io.IOException;
import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class microsoft_execl extends UiAutomatorTestCase {
	public void testmicrosoft_execl() throws UiObjectNotFoundException, RemoteException,
			IOException, InterruptedException {
		UiDevice device = getUiDevice();
		// wake up screen
		device.wakeUp();
		assertTrue("screen on :can't wakeup", device.isScreenOn());

		String appName = "com.microsoft.office.excel/com.microsoft.office.apphost.LaunchActivity";

		// check if the first time open app
		Runtime.getRuntime().exec("am start -n " + appName);
		Thread.sleep(6000);
		
		boolean dumpFirstStart = new UiObject(
				new UiSelector().resourceId("com.microsoft.office.excel:id/docsui_signinview_signup_button")).exists();
		if (dumpFirstStart == true) {
			UiObject skipButton = new UiObject(
					new UiSelector().resourceId("com.microsoft.office.excel:id/docsui_signinview_skipsignin"));
			skipButton.click();
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
