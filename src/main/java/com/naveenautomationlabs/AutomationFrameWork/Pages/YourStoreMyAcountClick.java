package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class YourStoreMyAcountClick extends TestBase{
	
	public YourStoreMyAcountClick() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css = "ul.list-inline>li:nth-of-type(2)")
	private WebElement myAccountBtn;
	
	@FindBy(css="ul.dropdown-menu>li:nth-of-type(2) a")
	private WebElement loginBtn;
	
	
	public YourStoreMyAcountClick clickMyAccountBtn() {
		myAccountBtn.click();
		return  new YourStoreMyAcountClick();
	}
	public AccountLogin clickLoginBtn() {
		loginBtn.click();
		return new AccountLogin();
	}
	
	
}
