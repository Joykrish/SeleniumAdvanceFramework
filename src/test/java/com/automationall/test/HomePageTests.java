package com.automationall.test;

import java.util.List;
import java.util.Objects;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allautomatin.driver.Driver;
import com.allautomatin.driver.DriverManager;

public final class HomePageTests extends BaseTests {

	private HomePageTests() {

	}

	@Test
	public void dologinandSearchThree() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube", Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		assertThat(title).isNotNull().containsIgnoringCase("google search").matches("\\w.*" + "Google Search")
				.hasSizeBetween(15, 100);

		List<WebElement> elements = DriverManager.getDriver()
				.findElements(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"]"));

		assertThat(elements).hasSize(9).extracting(e -> e.getText()).contains("Testing Mini Bytes");

	}
}
