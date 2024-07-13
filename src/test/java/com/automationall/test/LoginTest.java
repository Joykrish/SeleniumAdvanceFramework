package com.automationall.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.allautomatin.driver.DriverManager;

public final class LoginTest extends BaseTests{
	
	private LoginTest(){
		
	}
	@Test
	public void dologinandSearch() {

		
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation");
	}

	

}
