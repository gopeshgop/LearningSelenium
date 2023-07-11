package com.naveenautomationlabs.AutomationFrameWork.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class RetryFailedTests extends TestBase implements IRetryAnalyzer{

	int maxCounter = 2;
	int count = 0;
	@Override
	public boolean retry(ITestResult result) {
		logger.info("Retrying failed test!!!!!!!!!!"+result.getMethod().getMethodName()+" for "+count+" times");
		if(count<maxCounter) {
			count++;
			return true;
		}
		return false;
	}

}
