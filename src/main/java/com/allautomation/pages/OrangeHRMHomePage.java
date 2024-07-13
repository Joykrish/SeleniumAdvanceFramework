package com.allautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.allautomatin.driver.DriverManager;
import com.allautomation.enums.WaitStrategy;
import com.google.common.util.concurrent.Uninterruptibles;

public class OrangeHRMHomePage extends BasePage {

	private final By linkWelcome = By.xpath("//li[@class=\"oxd-userdropdown\"]");
	private final By linklogout = By.xpath("//a[text()='Logout']");

	public OrangeHRMHomePage clickWelcome() {
		// Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

		click(linkWelcome,WaitStrategy.CLICKABLE);

		return this;

	}

	public OrangeHRMLoginPage clickLogOut() {
		// Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

		// wait.until(d->d.findElement(link_logout).isEnabled()); -----java 8 version
		click(linklogout,WaitStrategy.CLICKABLE);

		return new OrangeHRMLoginPage();
	}

}
