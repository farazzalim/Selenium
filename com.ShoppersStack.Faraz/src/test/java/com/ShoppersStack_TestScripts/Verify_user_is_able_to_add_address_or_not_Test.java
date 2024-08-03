package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.Base_Test;
import com.ShoppersStack.GenericUtility.Listeners_Utility;
import com.ShoppersStack.POM.AdressForm;
import com.ShoppersStack.POM.HomePage;
import com.ShoppersStack.POM.MyAddressPage;
import com.ShoppersStack.POM.MyProfilePage;
import com.aventstack.extentreports.Status;
@Listeners(Listeners_Utility.class)
public class Verify_user_is_able_to_add_address_or_not_Test extends Base_Test {
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {
		test.log(Status.INFO,"home page is dislayed");
		HomePage homepage=new HomePage(driver);
		homepage.getSettingbtn().click();
		
		homepage.getMyprofile().click();
		
		test.log(Status.INFO,"myprofile page is dislayed");
		MyProfilePage myprofile=new MyProfilePage(driver);
		myprofile.getMyAddressbtn().click();
		test.log(Status.INFO,"MY Address page is dislayed");
		MyAddressPage myaddress=new MyAddressPage(driver);
		myaddress.getAddAddressbtn().click();
		test.log(Status.INFO,"Address Form page is dislayed");
		AdressForm addressform=new AdressForm(driver);
		addressform.getOfficeRadioBtn().click();
		addressform.getNameTf().sendKeys(file.readExcelData("Sheet1", 1, 0));
		addressform.getHouseInfo().sendKeys(file.readExcelData("Sheet1", 1, 1));
		addressform.getStreetInfo().sendKeys(file.readExcelData("Sheet1", 1, 2));
		addressform.getLandmarkInfo().sendKeys(file.readExcelData("Sheet1", 1, 3));
		webdriverutil.selectByValue(addressform.getCountryDropDown(),file.readPropertyData("country"));
		webdriverutil.selectByValue(addressform.getStateDropDown(),file.readPropertyData("state"));
		webdriverutil.selectByValue(addressform.getCityDropDown(),file.readPropertyData("city"));
//		
//		addressform.getCountryDropDown().sendKeys(file.readPropertyData("country"));
//		addressform.getStateDropDown().sendKeys(file.readPropertyData("state"));
//		addressform.getCityDropDown().sendKeys(file.readPropertyData("city"));
		addressform.getPincodeTf().sendKeys(file.readExcelData("Sheet1", 1, 4));
		addressform.getPhoneNumTf().sendKeys(file.readExcelData("Sheet1", 1, 5));
		addressform.getAddAddressBtn().click();
		test.log(Status.INFO,"Logout successdfull");
		System.out.println("Done");
		
	}

}
