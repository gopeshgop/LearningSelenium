package com.naveenautomationlabs.AutomationFrameWork.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomationlabs.AutomationFrameWork.Utils.Utils;
import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class CustomListener extends TestBase implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Exicution started for" + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test "+result.getMethod().getMethodName()+"Success"+"*********************************");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Utils.takeScreenShot(result.getMethod().getMethodName());
		logger.info("Test "+result.getMethod().getMethodName()+"Failed"+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Exicution "+result.getMethod().getMethodName()+"Skipped "+"-----------------------------------------");
	}

}
