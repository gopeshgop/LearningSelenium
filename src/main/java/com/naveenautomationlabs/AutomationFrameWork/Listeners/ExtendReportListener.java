package com.naveenautomationlabs.AutomationFrameWork.Listeners;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportListener extends TestListenerAdapter {
	public ExtentHtmlReporter htmlRepoter;
	public ExtentReports extent;
	public ExtentTest test;

	@Override
	public void onStart(ITestContext testContext) {
		//generate Time stamp
		String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());
		
		//name of report
		String repName = "Report" + timeStamp + ".html";
		
		//save report
		htmlRepoter = new ExtentHtmlReporter("./Reports/" + repName);
		
		//load config file
		
		htmlRepoter.loadXMLConfig("./extend-config.xml");
		
		htmlRepoter.config().setDocumentTitle("FirstReport");
		htmlRepoter.config().setTheme(Theme.STANDARD);
		htmlRepoter.config().setTimeStampFormat(timeStamp);

		extent = new ExtentReports();
		extent.attachReporter(htmlRepoter);
		extent.setSystemInfo("Name of Tester", "Gopesh");
		extent.setSystemInfo("Enviornment", "Production");
		extent.setSystemInfo("Website", "https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		
		test = extent.createTest(tr.getMethod().getMethodName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		test = extent.createTest(tr.getMethod().getMethodName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		test = extent.createTest(tr.getMethod().getMethodName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.YELLOW));
	}

	@Override
	public void onFinish(ITestContext testContext) {
		
		extent.flush();

	}
}
