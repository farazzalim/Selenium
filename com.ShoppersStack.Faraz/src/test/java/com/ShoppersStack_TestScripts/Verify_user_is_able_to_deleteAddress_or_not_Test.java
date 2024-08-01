package com.ShoppersStack_TestScripts;

import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.Base_Test;
import com.ShoppersStack.POM.MyAddressPage;
import com.ShoppersStack.POM.MyProfilePage;

public class Verify_user_is_able_to_deleteAddress_or_not_Test extends Base_Test{
	
	@Test
	public void deleteAddress() throws InterruptedException {
		homePage.getSettingbtn().click();
		homePage.getMyprofile().click();
		
		MyProfilePage myprofile=new MyProfilePage(driver);
		myprofile.getMyAddressbtn().click();
		
		MyAddressPage myaddress=new MyAddressPage(driver);
		Thread.sleep(1000);
		myaddress.getDeleteaddressBtn().click();
		Thread.sleep(1000);
		myaddress.getRemoveAddressPopUpYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
