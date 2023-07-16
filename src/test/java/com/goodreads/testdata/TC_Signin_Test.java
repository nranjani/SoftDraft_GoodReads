package com.goodreads.testdata;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.goodreads.utilities.BaseClasss;
import com.goodreads.pageobject.MyBooksPage;
import com.goodreads.pageobject.SearchPage;
import com.goodreads.pageobject.SigninPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Signin_Test extends BaseClasss {
	
	private void initializeWebDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);	
	}
	
	@BeforeClass
	public void setup() 
	{
		initializeWebDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(baseURL);
	}
	
	@Test(priority=1)
	public void signinTest() 
	{
		SigninPage sp = new SigninPage(driver);
		sp.clickSigninlnk();
		logInfo("Moving to SigninPage");
		sp.clickSigninButton();
		logInfo("Clicking on SigninButton");
        sp.setSignin(username, password);
		logInfo("Entering Username and Password.");
		sp.clickSignin();
		logInfo("Signin Page Successful");
		captureScreenshot("signinTest");
		
	}
	@Test(priority=2)
	public void searchTest() throws InterruptedException 
	{
		SearchPage sp = new SearchPage(driver);
		
	    sp.setSearch(searchContent);
		logInfo("Search Content");
		sp.clickSearch();
		logInfo("SearchContent Successful");
		logInfo("My Book");
		sp.clickMyBook();
		driver.navigate().refresh();
		
		
	}
	@Test(priority=3)
	public void removeBook() {
		MyBooksPage sp = new MyBooksPage(driver);
		logInfo("Remove from My Book");
		sp.clickRemove();
		logInfo("My Books removed Successfully");
		Alert a = driver.switchTo().alert();
		a.accept();
		logInfo("Profile");
		sp.clickProfilebutton();
		logInfo("Signout");
		sp.signout();
	}
	@AfterClass
	public void quit() {
		driver.quit();
	}
	
	
	
}
