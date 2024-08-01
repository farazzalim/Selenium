package com.ShoppersStack.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Utility implements ISuiteListener,ITestListener{
	
	Java_Utility java = new Java_Utility();
	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts= (TakesScreenshot) Base_Test.sdriver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(Framework_Constants.screenshotPath + java.localDateTime()+ ".png");
		try {
			FileHandler.copy(file, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
