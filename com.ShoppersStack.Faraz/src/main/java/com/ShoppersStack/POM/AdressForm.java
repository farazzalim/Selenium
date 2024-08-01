package com.ShoppersStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdressForm {
	public AdressForm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Office")
	private WebElement officeRadioBtn;
	
	@FindBy(id = "Name")
	private WebElement NameTf;
	
	@FindBy(id = "House/Office Info")
	private WebElement houseInfo;
	
	@FindBy(id = "Street Info")
	private WebElement streetInfo;
	
	@FindBy(id = "Landmark")
	private WebElement landmarkInfo;
	
	@FindBy(id = "Country")
	private WebElement countryDropDown;
	
	@FindBy(id = "State")
	private WebElement stateDropDown;
	
	@FindBy(id = "City")
	private WebElement cityDropDown;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTf;
	
	@FindBy(id = "Phone Number")
	private WebElement PhoneNumTf;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;

	public WebElement getOfficeRadioBtn() {
		return officeRadioBtn;
	}

	public WebElement getNameTf() {
		return NameTf;
	}

	public WebElement getHouseInfo() {
		return houseInfo;
	}

	public WebElement getStreetInfo() {
		return streetInfo;
	}

	public WebElement getLandmarkInfo() {
		return landmarkInfo;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTf() {
		return pincodeTf;
	}

	public WebElement getPhoneNumTf() {
		return PhoneNumTf;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
	
}
