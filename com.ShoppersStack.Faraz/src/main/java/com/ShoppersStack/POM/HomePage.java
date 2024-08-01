package com.ShoppersStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'MuiAvatar-root')]")
	private WebElement settingbtn;
	
	@FindBy(xpath = "(//li[@role='menuitem'])[1]")
	private WebElement myprofile;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getSettingbtn() {
		return settingbtn;
	}

	public WebElement getMyprofile() {
		return myprofile;
	}
	
	

}
