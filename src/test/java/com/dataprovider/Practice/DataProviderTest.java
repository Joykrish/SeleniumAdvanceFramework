package com.dataprovider.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="getData3",dataProviderClass=Employee.class)

	public void testOneDataProvider(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println("enter userName");
		System.out.println("entering password");
		System.out.println("clicking Login");
	}
	
	
	
	
	@DataProvider
	public String[] getData() {
		String[] a={"Hare","Krishna","Radhe"};
		return a;
		 
	}
	
	@DataProvider
	public String[][] getData1() {
		return new String[] []{{"Hare"},{"Krishna"},{"Radhe"}};
		
		
	}

}
