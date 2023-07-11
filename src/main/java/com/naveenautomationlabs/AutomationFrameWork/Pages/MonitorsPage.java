package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class MonitorsPage extends TestBase{
	
	public MonitorsPage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css = "button[onclick=\"cart.add('42', '2');\"]")
	private WebElement addCartBtnAppleCinema30;
	
	public AppleCinema30 clickAddCartBtnOfAppleCinema30() {
		
		addCartBtnAppleCinema30.click();
		return new AppleCinema30();
	}
}
