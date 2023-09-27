package com.OSA.genericutility;

import java.io.File;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class Listenerimpleclass implements ITestListener {

	
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		//actual testscripts execution starts from here  
		
		String MethodName = result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"---->Execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	String MethodName = result.getMethod().getMethodName();	
	test.log(Status.PASS,MethodName+"---Passed");
	Reporter.log(MethodName+"----Testscript executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
//		TakesScreenshot ts=(TakesScreenshot)Baseclass.sdriver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dst=new File("./screenshot/Failedscript.png");
//		try {
//			FileUtils.copyFile(src, dst);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String MethodName = result.getMethod().getMethodName();
		try {
			String FailedScript = webDriverUtility.takeScreenShot(Baseclass.sdriver, MethodName);
			test.addScreenCaptureFromPath(FailedScript);
	        }
		catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		test.log(Status.FAIL,result.getThrowable());
		test.log(Status.FAIL, MethodName+"---Failed");
		Reporter.log(MethodName+"---Failed");
		
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, result.getThrowable());
		test.log(Status.SKIP, MethodName+"-----Skipped");
		Reporter.log(MethodName+"-----Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport= new ExtentSparkReporter("./Extentreport/report.html");
		
		htmlreport.config().setDocumentTitle("SDET-51");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Online shopping application");
		
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("OS", "windows-10");
		report.setSystemInfo("Base-Browser", "chrome");
		report.setSystemInfo("Base-URL", "http://rmgtestingserver/domain/Online_Shopping_Application/");
		report.setSystemInfo("Reporter Name", "Aishwarya L");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
	
	
	
	
	
	
	
	

