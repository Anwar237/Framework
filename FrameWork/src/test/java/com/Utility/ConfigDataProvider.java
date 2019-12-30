package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider

{
	Properties pro;
	
	public ConfigDataProvider()
	
	{
	
	      File src2=new File("C:\\Users\\DELL\\Desktop\\FrameWork 2\\FrameWork\\Config\\config.properties");
		
	       try
	       {
	    	   
			FileInputStream	fis=new FileInputStream(src2);
			   
			    pro = new Properties();
			    
			    pro.load(fis);
			    
		    }   
	       
	       catch (Exception e)
	       
	       {
	          System.out.println("file not loaded "+e.getMessage());
	          
		   }
	   
	       }
	
	      public String getBrowser()
	      {
	    	  return pro.getProperty("Browser");
	    	  
	      }
	      
	      
	      public String getAppUrl()
	      {
	    	  return pro.getProperty("Url");
	    	  
	      }
	      
	      
	     public String getDatafromConfig (String keytosarch)
	      {
	    	  return pro.getProperty(keytosarch);
	    	  
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
}
