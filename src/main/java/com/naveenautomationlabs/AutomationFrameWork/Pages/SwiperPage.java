package com.naveenautomationlabs.AutomationFrameWork.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class SwiperPage extends TestBase{
	
	List<WebElement> swiperElement =wd.findElements(By.cssSelector("div.swiper-slide a[href=\"index.php?route=product/product&path=57&product_id=49\""));
	
	

}
