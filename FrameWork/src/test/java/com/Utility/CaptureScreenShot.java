package com.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class CaptureScreenShot
{
    WebDriver driver;
   
	
	
	public static String ScreenShot(WebDriver driver) 
	{
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
     String	ScreenshotPath=System.getProperty("user.dir")+"/ScreenShot/fb/"+CaptureDate()+"login.png";
	
	
	try 
	
      {
		
		FileUtils.copyFile(src, new File(ScreenshotPath));
	} 
	 catch (IOException e)
	
	{
		System.out.println("page is not availale "+e.getMessage());
		
		
	}
	
	return ScreenshotPath;
	
	}
	
	public static String CaptureDate()
	
	{
	
	        DateFormat df= new SimpleDateFormat("MM_dd_yyyy HH_mm_ss");
	
	        Date date = new Date();
	        
	        String   Time=df.format(date);
	       
	        return Time;
	        
	}    
	
	
	
	
	
	
}
