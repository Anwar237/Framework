package com.Utility;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider
{
	FileInputStream fi;
	XSSFWorkbook wb;
	
	public  ExcelDataProvider()
	{
	
	       File src = new File("C:\\Users\\DELL\\Desktop\\FrameWork 2\\FrameWork\\Test Data\\Data.xlsx");
	       
	          try {
	        	  
				fi= new FileInputStream(src);
      
				  wb=  new XSSFWorkbook(fi);
			}
	          
	          catch (Exception e) 
	          {
				
	        	  System.out.println("file not found "+e.getMessage());
	          } 
		
		}
	
	
	    public String StringCellValue(String Sheetname , int Row , int Column ) 
	    
	    {
	    	return wb.getSheet(Sheetname).getRow(Row).getCell(Column).getStringCellValue();
	    
	    } 
	
	
        public String StringCellValue(int SheetIndex , int Row , int Column ) 
	    
	    {
	    	return wb.getSheetAt(SheetIndex).getRow(Row).getCell(Column).getStringCellValue();
	    
	    } 
	
	
       public double NumaricDataProvider(String Sheetname , int Row , int Column ) 
	    
	    {
	    	return wb.getSheet(Sheetname).getRow(Row).getCell(Column).getNumericCellValue();
	    
	    } 
	
	
	
	
	
	
	
	
}
