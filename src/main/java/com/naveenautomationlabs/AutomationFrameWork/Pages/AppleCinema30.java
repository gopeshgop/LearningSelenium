package com.naveenautomationlabs.AutomationFrameWork.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class AppleCinema30 extends TestBase {
	Robot robot;
	Select dropdown;
	
	public AppleCinema30() {
		PageFactory.initElements(wd, this);

	}

	@FindBy(css = "input[name=\"option[218]\"][value='5']")
	private WebElement radioBtnSmall;

	@FindBy(css = "input[name=\"option[223][]\"][value=\"10\"]")
	private WebElement checkBox3;
	@FindBy(css = "input[value=\"test\"]")
	private WebElement textInputBox;
	
	@FindBy(id = "input-option217")
	private WebElement inputSelect;
	
	
	
	
	
	
	
//	@FindBy(id = "input-option217 option[value=\"3\"]")
//	private WebElement selectBlue;
	
	
	
	
	@FindBy(id = "input-option209")
	private WebElement inputTextArea;

	@FindBy(id = "button-upload222")
	private WebElement fileUploadBtn;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//a[text()=\"shopping cart\"]")
	WebElement shoppingCartBtn;

	public AppleCinema30 clickRadioBtn() {
		radioBtnSmall.click();
		return new AppleCinema30();
	}

	public AppleCinema30 clickCheckBox3() {
		checkBox3.click();
		return new AppleCinema30();
	}

	public void textInputBox() {
		textInputBox.sendKeys("Hello this is to test");
	}

	public void inputSelect() {
		
		dropdown = new Select(inputSelect);
		
		dropdown.selectByValue("3");
		
	}


	
	public void fillInputTextArea() {
		inputTextArea.sendKeys("Hey this is filling text area");
	}

	public AppleCinema30 uploadFileOnClickFileUploadBtn() {

		fileUploadBtn.click();
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\gopes\\OneDrive\\Pictures\\Screenshots\\upload.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		return new AppleCinema30();

	}
	
	public void clickOkOnAlert() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.switchTo().alert().accept();
		
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public ShoppingCart clickOnShoppinCartBtn() {
		shoppingCartBtn.click();
		return new ShoppingCart();
	}
	
	public void performSelectingOptionsAvailable() {
		clickRadioBtn();
		clickCheckBox3();
		textInputBox();
		inputSelect();
		fillInputTextArea();
		uploadFileOnClickFileUploadBtn();
		clickOkOnAlert();
		clickOnAddToCartButton();
	}
	
	

}