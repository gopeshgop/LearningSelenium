package naveenautomationlabs.AutomationFramework.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFrameWork.Pages.AccountLogin;
import com.naveenautomationlabs.AutomationFrameWork.Pages.MyAccount;
import com.naveenautomationlabs.AutomationFrameWork.Pages.MyAccountInformation;
import com.naveenautomationlabs.AutomationFrameWork.Pages.YourStoreMyAcountClick;
import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class MyAccountInformationTest extends TestBase{
	
	YourStoreMyAcountClick youreStoreMyAccountClick;
	AccountLogin accountLogin;
	MyAccount myAccount;
	MyAccountInformation myAccountInformation;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		wait=new WebDriverWait(wd, 10) ;
		youreStoreMyAccountClick = new YourStoreMyAcountClick();
		
	}
	
	@Test
	public void validateSideNavigationEditAccount() {
		youreStoreMyAccountClick.clickMyAccountBtn();
		accountLogin = youreStoreMyAccountClick.clickLoginBtn();
		myAccount=accountLogin.clickLoginBtn();
		
		myAccountInformation= myAccount.clickOnEditAccountBtn();
		String myAccountInformationText = myAccountInformation.findMyAccountInformationText();
		
		Assert.assertEquals("My Account Information", myAccountInformationText, "Wrong Assertion");
	}
	
	@AfterMethod
	public void quit() {
		tearDown();
	}
}
