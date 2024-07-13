package com.allautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.allautomatin.driver.DriverManager;
import com.allautomation.constants.FrameworkConstants;
import com.allautomation.enums.WaitStrategy;
import com.automation.url.ExplicitWaitFactory;

public class BasePage {

	protected void click(By by, WaitStrategy waitStrategy) {

		ExplicitWaitFactory.performExplicitWait(waitStrategy, by).click();
		
	}

	protected void sendKeys(By by, String value, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performExplicitWait(waitStrategy, by).sendKeys(value);

	
	}

	public String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	private void explicitlyWaitForElementToBeClickable(By by) {
		new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
				.until(ExpectedConditions.elementToBeClickable(by));
	}

	private void explicitlyWaitForElementToBeVisible(By by) {
		new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
				.until(ExpectedConditions.presenceOfElementLocated(by));
	}

}
