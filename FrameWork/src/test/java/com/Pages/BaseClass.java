package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.BrowserFactory;
import com.Utility.CaptureScreenShot;
import com.Utility.ConfigDataProvider;
import com.Utility.ExcelDataProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass 
{
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports   report;
	public  ExtentTest logger;
	
	ExtentHtmlReporter	extent;
	
	
    @Parameters("browser")
    @BeforeClass
	public void set(String browser) 
	
	{
    	
    	
		 Reporter.log("browser started", true);
		// driver=BrowserFactory.loginapp(driver, config.getBrowser(), config.getAppUrl());
		 
		 // parameter browser giving from mvn build
		 
		 driver=BrowserFactory.loginapp(driver, browser,config.getAppUrl());
		 
		 
		 Reporter.log("app loaded ", true);
		  
	}
	
	
	   @AfterClass
       public void teardown()   
       {
		
		   Reporter.log("driver app closed", true);
		   BrowserFactory.quiteBrowser(driver);
	
       }

	   
	   @BeforeSuite
	   public void teardownsetup()
	   
	   {
		
		   Reporter.log("setup for reporting started", true);
		   
		    config= new ConfigDataProvider();
		    excel =new ExcelDataProvider();
		    

		    extent=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+CaptureScreenShot.CaptureDate()+"/Fb.html");
	        report= new ExtentReports();
		    report.attachReporter(extent);
		   

		    Reporter.log("test started ", true);
	   }
	   
	   @AfterMethod
	   public void CaptureMethod(ITestResult result) throws IOException 
	   
	   {

		    Reporter.log("screenshot added ", true);
		   
		   
		   if (result.getStatus()==ITestResult.FAILURE)
		   
		   {
			
		    logger.fail("test fail", MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenShot.ScreenShot(driver)).build());
		}
		  
		   
		   
		   else if (result.getStatus()==ITestResult.SUCCESS)
			   
		   {
			
		    logger.pass("test pass", MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenShot.ScreenShot(driver)).build());
		}
		  
		
		   report.flush();
		   
	   }
	   
	   
	   
	  
	   
	   
	   
	   
	   
	   
	   
}







