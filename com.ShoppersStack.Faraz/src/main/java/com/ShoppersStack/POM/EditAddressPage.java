package com.ShoppersStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddressPage {
	
	public EditAddressPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "Home")
	private WebElement homeRadiobutton;
	
	@FindBy(id = "Name")
	private WebElement nameTf;
	
	@FindBy(id = "House/Office Info")
	private WebElement houseNameTf;
	
	@FindBy(id = "Street Info")
	private WebElement streetInfoTf;
	
	@FindBy(id = "Landmark")
	private WebElement landmarkTf;
	
	@FindBy(name = "State")
	private WebElement stateDropeDownBtn;
	
	@FindBy(name ="City")
	private WebElement cityDropDownBtn;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTf;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumTf;
	
	@FindBy(id = "Update Address")
	private WebElement updateAddressBtn;

	public WebElement getHomeRadiobutton() {
		return homeRadiobutton;
	}

	public WebElement getNameTf() {
		return nameTf;
	}

	public WebElement getHouseNameTf() {
		return houseNameTf;
	}

	public WebElement getStreetInfoTf() {
		return streetInfoTf;
	}

	public WebElement getLandmarkTf() {
		return landmarkTf;
	}

	public WebElement getStateDropeDownBtn() {
		return stateDropeDownBtn;
	}

	public WebElement getCityDropDownBtn() {
		return cityDropDownBtn;
	}

	public WebElement getPincodeTf() {
		return pincodeTf;
	}

	public WebElement getPhoneNumTf() {
		return phoneNumTf;
	}

	public WebElement getUpdateAddressBtn() {
		return updateAddressBtn;
	}
	
	
	
	
}
