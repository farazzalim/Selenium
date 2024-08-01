package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.Base_Test;
import com.ShoppersStack.POM.EditAddressPage;
import com.ShoppersStack.POM.MyAddressPage;
import com.ShoppersStack.POM.MyProfilePage;

public class Verify_user_is_able_to_modifyAddress_or_not extends Base_Test{
	
	@Test
	public void editAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		
		homePage.getSettingbtn().click();
		homePage.getMyprofile().click();
		Thread.sleep(1000);
		
		MyProfilePage myprofile=new MyProfilePage(driver);
		myprofile.getMyAddressbtn().click();
		
		MyAddressPage myaddress=new MyAddressPage(driver);
		myaddress.getModifyAddresspencilBtn().click();
		
		EditAddressPage editaddress= new EditAddressPage(driver);
		editaddress.getHomeRadiobutton().click();
		editaddress.getHouseNameTf().sendKeys(file.readExcelData("Sheet1", 2, 0));
		editaddress.getHouseNameTf().sendKeys(file.readExcelData("Sheet1", 2, 1));
		editaddress.getStreetInfoTf().sendKeys(file.readExcelData("Sheet1", 2, 2));
		editaddress.getLandmarkTf().sendKeys(file.readExcelData("Sheet1", 2, 3));
		editaddress.getStateDropeDownBtn().sendKeys(file.readPropertyData("state"));
		editaddress.getCityDropDownBtn().sendKeys("city");
		editaddress.getPincodeTf().sendKeys(file.readExcelData("Sheet1", 2, 4));
		editaddress.getPhoneNumTf().sendKeys(file.readExcelData("Sheet1", 2, 5));
		editaddress.getUpdateAddressBtn().click();
	}

}
