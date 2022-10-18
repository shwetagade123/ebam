package com.bikkadit.ebam.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement loginUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement loginPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement LogOut;
	
	public void setUsername(String uname) {
		loginUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		loginPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		loginButton.click();
	}
	public void clickLogOut() {
		LogOut.click();
	}
	
	
	
	}


