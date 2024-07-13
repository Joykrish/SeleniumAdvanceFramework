package com.automationall.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.allautomatin.driver.Driver;

public class BaseTests {

	protected BaseTests() {

	}

	@BeforeMethod
	protected void setUP() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();

	}

}
