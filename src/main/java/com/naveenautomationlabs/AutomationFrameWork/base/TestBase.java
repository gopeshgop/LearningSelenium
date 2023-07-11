package com.naveenautomationlabs.AutomationFrameWork.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.naveenautomationlabs.AutomationFrameWork.Listeners.WebdiverEvents;
import com.naveenautomationlabs.AutomationFrameWork.Utils.Browsers;
import com.naveenautomationlabs.AutomationFrameWork.Utils.Environment;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver wd;
	private FileInputStream fileinputStream;
	private Properties prop;
	public static Logger logger;
	private WebdiverEvents events;
	private EventFiringWebDriver eDriver;
	private Browsers BROWSER = Browsers.CHROME;
	private Environment ENV = Environment.PROD;
	
	public TestBase() {
		prop = new Properties();
		try {
			fileinputStream = new FileInputStream(
					"C:\\Users\\gopes\\eclipse-workspace\\LearningSelenium\\src\\main\\java\\com\\naveenautomationlabs\\AutomationFrameWork\\Config\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 
		try {
			prop.load(fileinputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void setUpLogger() {
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.ALL);
		

	}
	
	public void initialisation() {
		PageFactory.initElements(wd, this);
		
		switch (BROWSER.getBrowserName()) {
		case "Chrome":
			wd = WebDriverManager.chromedriver().create();
			break;
		case "Edge":
			wd = WebDriverManager.edgedriver().create();
			break;
		case "FireFox":
			wd = WebDriverManager.firefoxdriver().create();
			break;

		default:
			System.out.println("Not a valid borwser name");
			break;
		}
		
		eDriver = new EventFiringWebDriver(wd);
		events = new WebdiverEvents();
		eDriver.register(events);
		wd=eDriver;
		  
		wd.get(ENV.getUrl());
		wd.manage().timeouts().implicitlyWait((Long.parseLong(prop.getProperty("IMPLICIT_WAIT"))), TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}

	public void tearDown() {

	}

}
