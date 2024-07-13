package com.allautomatin.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.allautomation.constants.FrameworkConstants;
import com.allautomation.enums.ConfigProperties;
import com.allautomation.utilities.JsonUtils;
import com.allautomation.utilities.PropertyUtils;

public final class Driver {

	private Driver() {

	}

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(JsonUtils.get(ConfigProperties.URL));
		}
		System.out.println(DriverManager.getDriver().getTitle());

	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
