package com.goodreads.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver sdriver;
	 public SearchPage(WebDriver rdriver)
	{
	
		sdriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	 
	 	@FindBy(xpath="//input[@placeholder='Search books']")
	 		WebElement searchtbx;

	 	@FindBy(xpath="//div[@class='searchBox searchBox--navbar']/child::form[@role='search']/child::button[@type='submit']")
	 		WebElement searchButton;
	 
	 	@FindBy(xpath="//button[@class='wtrToRead']")
		   	WebElement wantToRead;
	     @FindBy(css="body > div.content > div.siteHeader > div > header > div.siteHeader__topLine.gr-box.gr-box--withShadow > div > nav > ul > li:nth-child(2) > a")
	       WebElement myBook;
	 
	 public void setSearch(String search) {
			searchtbx.sendKeys("ikiagi");
			searchButton.click();
		}

		public void clickSearch() {
			 wantToRead.click();
		}
		public void clickMyBook()
		{
			myBook.click();
		}
			 
			
		
}
