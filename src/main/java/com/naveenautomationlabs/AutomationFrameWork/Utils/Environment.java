package com.naveenautomationlabs.AutomationFrameWork.Utils;

public enum Environment {
	DEV("Dev","https://naveenautomationlabsdev.com/opencart/index.php?route=common/home"),
	STAGE("Stage","https://naveenautomationlabsstage.com/opencart/index.php?route=common/home"),
	QA("QA","https://naveenautomationlabsqa.com/opencart/index.php?route=common/home"),
	PROD("Prod","https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	
	String env;
	String url;
	
	private Environment(String env, String URL) {
		this.env = env;
		this.url=URL;
	}
	
	public String getEnv() {
		return env;
	}
	
	public String getUrl() {
		return url;
	}
}
