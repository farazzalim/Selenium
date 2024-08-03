package com.ShoppersStack.GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack.POM.HomePage;
import com.ShoppersStack.POM.Login_Page;
import com.ShoppersStack.POM.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public Webdriver_Utility webdriverutil=new Webdriver_Utility();
	public File_Utility file=new File_Utility();
	public WebDriver driver;
	public Welcome_Page welcomePage;
	public Login_Page loginPage;
	public HomePage homePage;
	public WebDriverWait wait;
	public static WebDriver sdriver;
	Java_Utility java=new Java_Utility();
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
		spark=new ExtentSparkReporter(Framework_Constants.reportPath + java.localDateTime() + ".html" );
		report= new ExtentReports();
		report.attachReporter(spark);
		test=report.createTest("Demo");
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("@BeforeClass");
//		String browser = file.readPropertyData("browser");
//		String url = file.readPropertyData("url");	
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");

		
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else if(browser.contains("edge")) {
			driver= new EdgeDriver();
		}
		
		else {
			System.out.println("Enter valid Browser Name");
		}
		sdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(file.readPropertyData("url"));
		
		homePage=new HomePage(driver);
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("@BeforeMethod");
		welcomePage=new Welcome_Page(driver);
		WebElement ele = welcomePage.getLoginbtn();
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		Thread.sleep(3000);
		ele.click();
		
		loginPage=new Login_Page(driver);
		loginPage.getEmailTf().sendKeys(file.readPropertyData("username"));
		loginPage.getPasswordTf().sendKeys(file.readPropertyData("password"));
		
		loginPage.getLoginBtn().click();
		
		}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("@AfterMethod");
//		Thread.sleep(10000);
		homePage.getSettingbtn().click();
		homePage.getLogoutBtn().click();
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("@AfterTest");
		report.flush();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
