package com.dataprovider.Practice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataProviders {
	@Test(dataProvider = "getData1")
	public void test1(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

	@Test(dataProvider = "getData1")
	public void test2(String userName) {
		System.out.println(userName);

	}
	@DataProvider
	public static Object[] getData1(Method m) {
		if(m.getName().equalsIgnoreCase("test1")) {
			return new Employee[] {
					new Employee("Radhe","1"),
					new Employee("Gopi","108")
			};
		}
		else if(m.getName().equalsIgnoreCase("test2")) {
			return new Object[] {
					"Govinda","Krishna"
			};
		}
		return null;
	}
}
