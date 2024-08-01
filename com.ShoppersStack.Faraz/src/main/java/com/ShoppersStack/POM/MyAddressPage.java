package com.ShoppersStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
	public MyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressbtn;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[2]")
	private WebElement deleteaddressBtn;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement removeAddressPopUpYesBtn;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[1]")
	private WebElement modifyAddresspencilBtn;

	public WebElement getModifyAddresspencilBtn() {
		return modifyAddresspencilBtn;
	}

	public WebElement getAddAddressbtn() {
		return addAddressbtn;
	}

	public WebElement getDeleteaddressBtn() {
		return deleteaddressBtn;
	}

	public WebElement getRemoveAddressPopUpYesBtn() {
		return removeAddressPopUpYesBtn;
	}

}
