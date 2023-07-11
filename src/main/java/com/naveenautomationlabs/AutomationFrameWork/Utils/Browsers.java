package com.naveenautomationlabs.AutomationFrameWork.Utils;

public enum Browsers {
	CHROME("Chrome"),
	EDGE("Edge"),
	FIREFOX("Firefox"),
	SAFARI("Safari");
	String browserName;
	
	Browsers(String nameOfbrowser) {
		browserName = nameOfbrowser;
	}
	
	public String getBrowserName() {
		return browserName;
	}

}
