package com.allautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.allautomatin.driver.DriverManager;
import com.allautomation.enums.WaitStrategy;
import com.google.common.util.concurrent.Uninterruptibles;

public final class OrangeHRMLoginPage extends BasePage {

	private final By txtUsername = By.name("username");

	private final By txtPassword = By.xpath("//input[@name='password' and @type='password']");

	private final By btnLogin = By.xpath("//button[text()=\" Login \"]");

	public OrangeHRMLoginPage enterUsername(String userName) {
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		sendKeys(txtUsername, userName,WaitStrategy.PRESENCE);

		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(txtPassword, password,WaitStrategy.PRESENCE);

		return this;
	}

	public OrangeHRMHomePage clickLogin() {

		click(btnLogin,WaitStrategy.CLICKABLE);

		return new OrangeHRMHomePage();

	}

	public String getTitle() {
		return getPageTitle();
	}
}
