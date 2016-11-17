package com.mycomp;

import android.graphics.Rect;
import android.os.RemoteException;

import com.android.uiautomator.core.Configurator;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class computer extends UiAutomatorTestCase {
	public void testdclick()  throws UiObjectNotFoundException,RemoteException{
//		UiDevice device = getUiDevice();
//		// wake up screen
//		device.wakeUp();
//		assertTrue("screen on :can't wakeup", device.isScreenOn());
//		getUiDevice().pressHome();
		
		//调用方法
		   //double click mycomputer
		    int y=45;
		    int x=55;
//		    //调用上面声明的方法体
		    quicklyClick(2, x,y);
		    
		//double click mycomputer
//		UiObject computer= new UiObject(new UiSelector().resourceId("com.android.launcher3:id/icon"));
//		Rect r=computer.getBounds();
		
		// if filemanager,print ok;else print failed.
		UiObject openym= new UiObject (new UiSelector().resourceId("android:id/mwOuterBorder"));
		if (openym.waitForExists(2000)) {
			System.out.println("open mycomputer successful.");
         }
	}
//	public void testrclick()  throws UiObjectNotFoundException,RemoteException{	
//		
//	}
	//声明方法
	public void quicklyClick(int num,int x,int y){  
	    //获取动作间隔时间
	    long actionTime=Configurator.getInstance().getActionAcknowledgmentTimeout();
	    //设置动作间隔时间
	    Configurator.getInstance().setActionAcknowledgmentTimeout(0);
	    //设置操作步骤
	    for(int i=0;i<=num;i++){
	        UiDevice.getInstance().click(x, y);
	    }
	    //最后别忘了恢复默认时间间隔，避免影响后面其他的用例
	    Configurator.getInstance().setActionAcknowledgmentTimeout(actionTime);
	}

}