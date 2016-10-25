package com.autoTestUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class otoDisplayRun {
	
	private static String workspace_path;
	public static String logFile;
	public static String apppackage;
	public static String appactivity;
	public static String appName;
	public static String port;
	
	public  otoDisplayRun() throws InterruptedException {
		workspace_path = getWorkSpase();
		System.out.println("----工作空间：\t\n" + workspace_path);
	}
	
	// 1 创建 build.xml
	public void buildObjJarFile (String projectName, String androidTargetId) throws InterruptedException, IOException{
		System.out.println("**********************");
		System.out.println("---START BUILDING----");
		System.out.println("**********************");
		
		logFile = "runlog.log";
		// 1 创建 build.xml
		execCmd("android create uitest-project -n " + projectName + " -t "
				+ androidTargetId + " -p " + workspace_path);
		
		// 2 ant build 编译 生成projectName.jar 
		execCmd("ant build");
		
		System.out.println("**********************");
		System.out.println("---FINISH BUILDING----");
		System.out.println("**********************");
	}
	
	//获取工作环境目录
	public String getWorkSpase() {
		File directory = new File("");
		String abPath = directory.getAbsolutePath();
		return abPath;
	}
	
	/**
	 * 执行cmd命令，且输出信息到控制台
	 * @throws InterruptedException 
	 * @throws IOException
	 */
	public static int execCmd(String cmd) throws InterruptedException, IOException{
		int ret = 0;
		System.out.println("----execCmd:  " + cmd);
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			//正确输出流 输出到log 信息
			InputStream input = p.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line = "";
			while ((line = reader.readLine()) != null) {
				if(line.indexOf("Time")>-1){
					ToFile(cmd.substring(cmd.lastIndexOf("test"))+".runtime:"+Double.parseDouble(line.substring(6)),"apkresult",false);
					}
				if(line.indexOf("OK (1 test)")>-1){
					ToFile(cmd.substring(cmd.lastIndexOf("test"))+".result:"+1,"apkresult",false);
				}
				if(line.indexOf("FAILURES!!!")>-1){
					ToFile(cmd.substring(cmd.lastIndexOf("test"))+".result:"+0,"apkresult",false);
				}
				System.out.println(line);
                saveToFile(line, logFile, false);
 			}
			
			//错误输出流,将标准错误转为标准输出（防止子进程运行阻塞）
			InputStream errorInput = p.getErrorStream();
			BufferedReader errorReader = new BufferedReader(new InputStreamReader(
					errorInput));
			String eline = null;
			while ((eline = errorReader.readLine()) != null) {
				System.out.println("<ERROR>" + eline);
                saveToFile(eline, logFile, false);
			}
			ret = p.waitFor();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}

	// 将运行结果保存至文件中
    public static void saveToFile(String text,String path,boolean isClose) {
    	File file=new File(logFile);   
		BufferedWriter bf=null;
		try {
		    FileOutputStream outputStream=new FileOutputStream(file,true);
		    OutputStreamWriter outWriter=new OutputStreamWriter(outputStream);
		    bf=new BufferedWriter(outWriter);
			bf.append(text);
			bf.newLine();
			bf.flush();
			
			if(isClose){
				bf.close();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    public static void ToFile(String text,String path,boolean isClose) {
    	File file=new File("apkresult");   
		BufferedWriter bf=null;
		try {
		    FileOutputStream outputStream=new FileOutputStream(file,true);
		    OutputStreamWriter outWriter=new OutputStreamWriter(outputStream);
		    bf=new BufferedWriter(outWriter);
			bf.append(text);
			bf.newLine();
			bf.flush();
			
			if(isClose){
				bf.close();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
	/**
	 * 执行cmd命令，等待进程结束
	 * @throws InterruptedException 
	 */
	public static int execCmdNoSave(String cmd) throws InterruptedException {
		int ret = 0;
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			//错误输出流,将标准错误转为标准输出（防止子进程运行阻塞）
			InputStream errorInput = p.getErrorStream();
			BufferedReader errorReader = new BufferedReader(new InputStreamReader(
					errorInput));
			String eline = null;
			while ((eline = errorReader.readLine()) != null) {
				System.out.println("<ERROR>" + eline);
			}

			ret = p.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ret;
	}
    
	// 3---push jar
	public int pushTestJar(String jarName, String objJarPath) throws InterruptedException, IOException {
		String jarFile = workspace_path + "/" + objJarPath + jarName;
		String targetPath = "/data/local/tmp/";
	    String pushCmd = "adb -s " +env.targetIp + ":" + port +" push " + jarFile + " " + targetPath;
		//String pushCmd = "adb   push " + jarFile + " " + targetPath;

		
		System.out.println("----jar包路径： " +  jarFile);
		System.out.println("----" + pushCmd);
		return execCmd(pushCmd);
	}
	
	// 4 run test
	public void runTest(String jarName, String className, String testFuncName) throws InterruptedException, IOException {
	    String testCmd = "adb -s " + env.targetIp + ":" + port + " shell uiautomator runtest " + jarName + " --nohup -c " + className + "#" + testFuncName;
		//String testCmd = "adb  shell uiautomator runtest " + jarName + " --nohup -c " + className + "#" + testFuncName;
		System.out.println("----runTest:  " + testCmd);
		execCmd(testCmd);
	}
}
