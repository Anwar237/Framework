package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginData
{
	
	WebDriver driver;

	public void appdata(WebDriver ldriver) 
	{
	
		this.driver=ldriver;
		
	}
	
	
		@FindBy(name="email") WebElement UserName;
		
		@FindBy(name="pass") WebElement PassWord;
		
		@FindBy(id="u_0_b") WebElement SumbitButton;
		
		@Test
		public void loginfb(String Appusername , String AppPassword) {
			
			
			UserName.sendKeys(Appusername);
			
			PassWord.sendKeys(AppPassword);
			
			SumbitButton.click();
			
		}
}
