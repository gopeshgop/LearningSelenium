package com.naveenautomationlabs.AutomationFrameWork.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
import javax.xml.crypto.Data;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class Utils extends TestBase {

	public static void takeScreenShot(String testName) {

		String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());
		File screenshotFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("./FailedTestScreenShot\\"+"_"+testName+"_"+timeStamp+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
