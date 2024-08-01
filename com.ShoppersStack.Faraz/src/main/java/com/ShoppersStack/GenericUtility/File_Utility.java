package com.ShoppersStack.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility  {
	
	public String readPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(Framework_Constants.propertiesPath);
		Properties pro=new Properties();
		pro.load(fis);
		
		String value = pro.getProperty(key);
		return value;
	}
	
	public String readExcelData(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Framework_Constants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
	}

}
