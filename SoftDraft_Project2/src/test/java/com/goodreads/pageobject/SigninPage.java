package com.goodreads.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	WebDriver sdriver;
	 public SigninPage(WebDriver rdriver)
	{
	
		sdriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	 
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signinlink;
		
	@FindBy(xpath="//button[contains(.,'Sign in with email')]")
	WebElement signinButton;
	
	@FindBy(id="ap_email")
	WebElement untbx;
	
	@FindBy(id="ap_password")
	WebElement pwdtbx;
	
	@FindBy(id="signInSubmit")
	WebElement signinbtn;

	
	public void clickSigninlnk(){
		signinlink.click();
		
	}
	public void clickSigninButton() {
		signinButton.click();
	}
	
	public void setSignin(String un, String pw) {
		untbx.sendKeys("ranjanin04@gmail.com");
		pwdtbx.sendKeys("Goodreads");
			
	}

	public void clickSignin() {
		signinbtn.click();
		
	}
	
	}
	
