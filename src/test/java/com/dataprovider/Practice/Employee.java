package com.dataprovider.Practice;

import org.testng.annotations.DataProvider;

public class Employee {
	
	private String name;
	private String id;
	
	Employee(String name,String id){
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
	
	@DataProvider
	public static  Employee[] getData3() {
		return new Employee[] {
			new Employee("HareKrishna","108"),
			new Employee("HareRama","110")
		};
		
		
	}
	
	

}
