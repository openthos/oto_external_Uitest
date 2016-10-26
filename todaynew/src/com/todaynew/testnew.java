package com.todaynew;

import java.io.IOException;

import android.os.RemoteException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
//import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class testnew extends UiAutomatorTestCase {
	public void testtodaynew() throws UiObjectNotFoundException,RemoteException{
		UiDevice device = getUiDevice();
		// wake up screen
		device.wakeUp();
		assertTrue("screen on :can't wakeup", device.isScreenOn());
	
		// start browser
		try {
			Runtime.getRuntime().exec(
					" am start -n com.ss.android.article.news/com.ss.android.article.news.activity.MainActivity");
					sleep(2000);
		} catch (IOException e) {
			// TODO auto-generated catch block
			e.printStackTrace();
		}
		sleep(5000);
		//推荐页面-最大化头条，然后滑动页面
		UiObject tuijian=new UiObject(new UiSelector().text("推荐"));
		tuijian.clickAndWaitForNewWindow();

		UiObject maxObject=new UiObject(new UiSelector().resourceId("android:id/mwMaximizeBtn"));
		maxObject.click();

		UiObject swipe10=new UiObject(new UiSelector().resourceId("com.ss.android.article.news:id/main_layout"));
		swipe10.swipeUp(10);
		sleep(2000);
		
  //      UiDevice.getInstance().drag(660, 860, 360, 360, 50);
  //      sleep(1000);

		UiObject redian=new UiObject(new UiSelector().text("热点"));
		redian.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject shehui=new UiObject(new UiSelector().text("社会"));
		shehui.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject dingyue=new UiObject(new UiSelector().text("订阅"));
		dingyue.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject yule=new UiObject(new UiSelector().text("娱乐"));
		yule.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject picture=new UiObject(new UiSelector().text("图片"));
		picture.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject keji=new UiObject(new UiSelector().text("科技"));
		keji.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject car=new UiObject(new UiSelector().text("汽车"));
		car.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject tiyu=new UiObject(new UiSelector().text("体育"));
		tiyu.clickAndWaitForNewWindow();
		sleep(200);
		
		UiObject caijing=new UiObject(new UiSelector().text("财经"));
		caijing.clickAndWaitForNewWindow();
		sleep(200);
						
		UiObject junshi=new UiObject(new UiSelector().text("军事"));
		junshi.clickAndWaitForNewWindow();
		sleep(200);

	}

}
