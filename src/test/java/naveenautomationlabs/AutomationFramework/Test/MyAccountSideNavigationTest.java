package naveenautomationlabs.AutomationFramework.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFrameWork.Pages.AccountLogin;
import com.naveenautomationlabs.AutomationFrameWork.Pages.MyAccount;
import com.naveenautomationlabs.AutomationFrameWork.Pages.YourStoreMyAcountClick;
import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class MyAccountSideNavigationTest extends TestBase {
	
	YourStoreMyAcountClick youreStoreMyAccountClick;
	AccountLogin accountLogin;
	MyAccount myAccount;
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		youreStoreMyAccountClick = new YourStoreMyAcountClick();
		
	}
	
	@Test
	public void validateSideNavigationMyAccount() {
		
		youreStoreMyAccountClick.clickMyAccountBtn();
		accountLogin = youreStoreMyAccountClick.clickLoginBtn();
		myAccount=accountLogin.clickLoginBtn();
		String myAcountText = myAccount.getMyAccountText();
		Assert.assertEquals("My Account", myAcountText, "Wrong Assertion");
		
	}
	

}
