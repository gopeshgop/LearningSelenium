package com.naveenautomationlabs.AutomationFrameWork.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class YourStoreComponentClick extends TestBase{
	
	public YourStoreComponentClick() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css = "div.collapse>ul>li:nth-of-type(3) a")
	private WebElement componentLink;
	@FindBy(css = "ul.nav>li:nth-of-type(3)>div>div>ul>li:nth-of-type(2) a")
	private WebElement monitorComponentLink;
	
	public YourStoreComponentClick clickComponents() {
		componentLink.click();
		return new YourStoreComponentClick();
	}
	
	public MonitorsPage clickMonitors() {
		monitorComponentLink.click();
		return new MonitorsPage();
	}
	
}
