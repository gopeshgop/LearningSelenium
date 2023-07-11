package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class MyAccount extends TestBase {
	
	public MyAccount() {
		PageFactory.initElements(wd, this);
	}
	@FindBy(css="#content>h2:first-of-type")
	WebElement myAccountText;
	
	@FindBy(css = "div.list-group a:nth-of-type(2)")
	WebElement editAccountBtn;
	
	public String getMyAccountText() {
		return myAccountText.getText();
	}
	
	

	public MyAccountInformation clickOnEditAccountBtn() {
		editAccountBtn.click();
		return new MyAccountInformation();
	}
}
