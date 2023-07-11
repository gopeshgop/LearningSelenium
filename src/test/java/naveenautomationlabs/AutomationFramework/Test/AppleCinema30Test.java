package naveenautomationlabs.AutomationFramework.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFrameWork.base.TestBase;

public class AppleCinema30Test extends TestBase{
	
YourStoreTest yourStore;
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStoreTest();
	}
	
	@Test
	public void validateCheckOut() {
		
		
	}
	
	@AfterMethod
	public void quit() {
		tearDown();
	}


}
