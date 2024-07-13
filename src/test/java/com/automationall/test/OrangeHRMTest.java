package com.automationall.test;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.allautomation.pages.OrangeHRMHomePage;
import com.allautomation.pages.OrangeHRMLoginPage;

public final class OrangeHRMTest extends BaseTests {
	
	private OrangeHRMTest(){
		
	}
	
	@Test
	public void  loginLogOutTest()  {
		String title=new OrangeHRMLoginPage().enterUsername("Admin").enterPassword("admin123").clickLogin().clickWelcome().clickLogOut().getTitle();
	
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
		
		
	}

}
   