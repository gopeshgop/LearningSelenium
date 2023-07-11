package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class ShoppingCart extends TestBase {

	public ShoppingCart() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.buttons>div:nth-of-type(2) a")
	private WebElement checkOutBtn;
	@FindBy(css = "div.alert")
	private WebElement alertAfterClickingCheckOut;

	public String clickOnCheckOutBtn() {
		checkOutBtn.click();
		return alertAfterClickingCheckOut.getText();
	}

}
