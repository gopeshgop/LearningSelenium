package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class AccountLogin extends TestBase {
	public AccountLogin() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailInputField;

	@FindBy(id = "input-password")
	private WebElement passwordInputField;

	@FindBy(css = "input[value=\"Login\"]")
	private WebElement emailLoginBtn;

	public void enterEmail() {
		emailInputField.sendKeys("ryan@gmail.com");
	}

	public void enterPassword() {
		passwordInputField.sendKeys("ChangePass1");
	}

	public MyAccount clickLoginBtn() {
		enterEmail();
		enterPassword();
		emailLoginBtn.click();
		return new MyAccount();
	}

	public MyAccount loginPortal() {
		enterEmail();
		enterPassword();
		
		return clickLoginBtn();
	}
}
