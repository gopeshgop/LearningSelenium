package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class MyAccountInformation extends TestBase{
	WebDriverWait wait;
	
	
//	@FindBy(xpath = "//html/head/title")
//	WebElement infoTextInEditAccount;
	
	public String findMyAccountInformationText() {
		wait=new WebDriverWait(wd, 10);
		wait.until(ExpectedConditions.titleContains("My Account Information"));
	
		return wd.getTitle();
		
	}

}
