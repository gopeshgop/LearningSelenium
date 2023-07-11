package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class EditAccount extends TestBase {

//	WebElement myAccountBtn=wd.findElement(By.cssSelector("div.list-group a:nth-of-type(1)"));
//	String accountLinkInMyAccountPage = wd.findElement(By.xpath("//a[text()='Account']")).getText();
//	
	@FindBy(css = "div.list-group a:nth-of-type(2)")
	WebElement editAccountBtn;

	public MyAccountInformation clickOnEditAccountBtn() {
		editAccountBtn.click();
		return new MyAccountInformation();
	}
}
