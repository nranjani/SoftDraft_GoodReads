package com.goodreads.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBooksPage {
	WebDriver sdriver;
	 public MyBooksPage(WebDriver rdriver)
	{
	
		sdriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	 @FindBy(xpath="//a[@data-method='post']")
		WebElement removefromMyBooks;
	 
	 @FindBy(xpath="/html/body/div[2]/div[1]/div/header/div[2]/div/div[3]/ul/li[5]/div/a/span/img")
	  WebElement profileButton; 
	 
	 @FindBy(css="body > div.content > div.siteHeader > div > header > div.siteHeader__topLine.gr-box.gr-box--withShadow > div > div.siteHeader__personal > ul > li:nth-child(5) > div > div > div > ul > li:nth-child(13) > a")
	 WebElement signoutButton;
	 
	 public void clickRemove() {
		 removefromMyBooks.click();
	 }
		public void clickProfilebutton(){
			profileButton.click();
		}
		public void signout() {
			signoutButton.click();
}
	 
}