package com.OSA.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {

	
	
/**
 * This method is used to read data from excel sheet
 * @param SheetName
 * @param rowNo
 * @param cellNo
 * @return
 * @throws Throwable
 * @throws FileNotFoundException
 * @throws IOException
 */
	public String readDataFromExcelSheet(String SheetName,int rowNo,int cellNo) throws Throwable, FileNotFoundException, IOException {
		
		Workbook wb=WorkbookFactory.create(new FileInputStream(IpathConstants.excelpath));
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.toString();
		return data;
		
	}
	
	
	/**
	 * This method is used to write data into excel sheet
	 * @param SheetName
	 * @param rowNo
	 * @param cellNo
	 * @param value
	 * @throws Throwable
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void writeDataIntoExcelSheet(String SheetName,int rowNo,int cellNo,String value) throws Throwable, FileNotFoundException, IOException {
		Workbook wb=WorkbookFactory.create(new FileInputStream(IpathConstants.excelpath));
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.createRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(value);
		
		FileOutputStream fout=new FileOutputStream(IpathConstants.excelpath);
		wb.write(fout);
		wb.close();
		
		
	}
	/**
	 * 
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public int getRowCount(String SheetName) throws Throwable, FileNotFoundException, IOException {
		Workbook wb=WorkbookFactory.create(new FileInputStream(IpathConstants.excelpath));
		Sheet sh = wb.getSheet(SheetName);
		int row = sh.getLastRowNum();
		return row;
	}
	/**
	 * 
	 * @param sheetName
	 * @param keyColumn
	 * @param valueColumn
	 * @param driver
	 * @param jLib
	 * @return
	 * @throws Throwable
	 */
	
	public HashMap<String,String> getMultipleDataFromExcel(String sheetName,int keyColumn,int valueColumn,WebDriver driver)throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstants.excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int count= sh.getLastRowNum();
		
		HashMap<String,String>map = new HashMap<String,String>(); //empty map
		
		for(int i=1;i<=count;i++)
		{
			String key = sh.getRow(i).getCell(keyColumn).getStringCellValue();
			String value = sh.getRow(i).getCell(valueColumn).getStringCellValue();
			map.put(key, value);
		}
//	for(Entry<String, String> s:map.entrySet())
//		
//			{
//				driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
//			}
	return map;
	}


	

     public Object[][] getMultiplesetofData(String SheetName) throws Throwable, IOException{
    	 FileInputStream fis=new FileInputStream(IpathConstants.excelpath);
    	 Workbook wb=WorkbookFactory.create(fis);
    	 Sheet sh = wb.getSheet(SheetName);
    	 int lastrow = sh.getLastRowNum();
    	 int lastcell = sh.getRow(0).getLastCellNum();
    	 
    	 Object[][] obj=new Object[lastrow+1][lastcell];
    	 for(int i=0;i<=lastrow;i++) {
    		for(int j=0;j<lastcell;j++) {
    			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
    			
    		}
    	 }
    	 return obj;
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
