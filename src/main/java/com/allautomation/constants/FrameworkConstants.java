package com.allautomation.constants;

public class FrameworkConstants {
	
	
	private static final String RESOURNCEPATH=System.getProperty("user.dir")+ "/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURNCEPATH +"/Executables/chromedriver.exe";
	private static final String PROPERTYFILEPATH = RESOURNCEPATH +"/config/config.properties";
	private static final String JSONFILEPATH = RESOURNCEPATH +"/config/config1.json";
	private static final int EXPLICITWAIT=10;

	private FrameworkConstants() {

	}

	public static String getJsonFilepath() {
		return JSONFILEPATH;
	}

	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}

	public static String getPropertyFilepath() {
		return PROPERTYFILEPATH;
	}

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

}
