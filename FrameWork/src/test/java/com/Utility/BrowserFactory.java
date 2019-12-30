package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	
	 

	public static WebDriver loginapp(WebDriver driver , String Browsername , String appurl)
	{
	
		  if (Browsername.equalsIgnoreCase("Chrome"))
			
		   {
			
			  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\FrameWork 2\\FrameWork\\Drivers\\chromedriver.exe ");
			
			  driver=new ChromeDriver();
			
		   }
		
		   else if (Browsername.equalsIgnoreCase("firefox"))
			
		   {
			
			
           // System.setProperty("WebDriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\FrameWork 2\\FrameWork\\Drivers\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			 
			}
		   
		   else
			
		   {
			   
			System.out.println("Browser is not valid");
			
		   }
		  
		  try
		  {
			Thread.sleep(2000);
		
		  } 
		  
		  catch (InterruptedException e) 
		  {
			  
			  e.getMessage();
		}
		  
		  
		
		    driver.get(appurl);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		    return driver;
	}
	
	             public static void quiteBrowser(WebDriver driver) 
	             
	             {
		
	                driver.quit();
		
		
	             }
}
