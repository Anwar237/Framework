package com.Test_Cases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.BaseClass;
import com.Pages.LoginData;
import com.Utility.ExcelDataProvider;
import com.aventstack.extentreports.ExtentTest;


public class LoginFB extends BaseClass

{
	
	@Test
	public void loginApp() 
	
	
	{
		
	     logger=report.createTest("fb login");
	     
	     
		
	    LoginData login =PageFactory.initElements(driver, LoginData.class);
	    
		logger.info("application started");
		
		login.loginfb(excel.StringCellValue("fb", 0, 0), excel.StringCellValue("fb", 0, 1));
		
		logger.pass("test success");
		
		
	}
}
