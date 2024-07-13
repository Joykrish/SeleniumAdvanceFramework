package com.automationall.test;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allautomation.pages.OrangeHRMLoginPage;

public class OrangeHRMTestDataDriven extends BaseTests {
	
private OrangeHRMTestDataDriven(){
		
	}
	
	@Test(dataProvider="LoginTestData")
	public void  loginLogOutTest(String userName,String password)  {
		String title=new OrangeHRMLoginPage().enterUsername(userName).enterPassword(password).clickLogin().clickWelcome().clickLogOut().getTitle();
	
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
		
		
	}
	@DataProvider(name="LoginTestData",parallel=true)
	public Object[] [] getData(){
		return new  Object[] []{
			{"Admin","admin123"},
			{"Admin123","admin1234"},
			{"Admin","admin123"},
			{"Admin12","admin1234"},
			{"Admin1","admin123"},
			{"Admin13","admin1234"}
		};
		
	}

}
