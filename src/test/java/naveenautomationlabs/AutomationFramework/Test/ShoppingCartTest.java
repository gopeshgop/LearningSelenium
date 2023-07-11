package naveenautomationlabs.AutomationFramework.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFrameWork.Pages.AppleCinema30;
import com.naveenautomationlabs.AutomationFrameWork.Pages.MonitorsPage;
import com.naveenautomationlabs.AutomationFrameWork.Pages.ShoppingCart;
import com.naveenautomationlabs.AutomationFrameWork.Pages.YourStoreComponentClick;
import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class ShoppingCartTest extends TestBase {



	
	
	
	YourStoreComponentClick yourStore;
	MonitorsPage monitorsPage;
	AppleCinema30 appleCinema30;
	ShoppingCart shoppingCart;
	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStoreComponentClick();
	}

	@Test
	public void validateCheckOut() {

		yourStore.clickComponents();
		monitorsPage = yourStore.clickMonitors();

		appleCinema30 = monitorsPage.clickAddCartBtnOfAppleCinema30();

		appleCinema30.performSelectingOptionsAvailable();

		shoppingCart = appleCinema30.clickOnShoppinCartBtn();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String alertMessage = shoppingCart.clickOnCheckOutBtn();
		Assert.assertEquals(alertMessage,
				"Products marked with *** are not available in the desired quantity or not in stock!");

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
