package com.naveenautomationlabs.AutomationFrameWork.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class MyWishList extends TestBase{
	
	public int getIndexOfColumn(MyWishListTable columnName) {
		List<WebElement> headers = wd.findElements(By.cssSelector("table.table thead tr td"));
		for (WebElement headerElement : headers) {
			if(headerElement.getText().equals(columnName.value)) {
				return headers.indexOf(headerElement);
			}
			
		}
		return -1;
	}
	
	
	public enum MyWishListTable {
		IMAGE("Image"),
		PRODUCT_NAME("Product Name"),
		MODEL("Model"),
		STOCK("Stock"),
		UNIT_PRICE("Unit Price"),
		ACTION("Action");
		
		String value;
		
		private MyWishListTable(String value) {
			this.value=value;
		}
		public String getTableHeaderValue() {
			return value;
		}
	}

}
