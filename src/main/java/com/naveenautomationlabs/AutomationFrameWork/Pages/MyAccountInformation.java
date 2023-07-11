package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class MyAccountInformation extends TestBase{
	
	@FindBy(css = "#content h1")
	WebElement infoTextInEditAccount;
	
	public String findMyAccountInformationText() {
		String testText = infoTextInEditAccount.getText();
		return testText;
		
	}

}
