package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPF {
	
	//need driver to handle null pointer exception
	public SeleniumPF (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
    //AccMod. -Def.==> 
	//Encapsulation = private + getter method
	//Bring Xpath: Selenium PF = @FindBy (xpath ="")
	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//*[text()='Log Out']")
	private WebElement logoutBtn;
	 
	@FindBy(xpath = "//*[text()='Error!']")
	private WebElement errorMsgwinvalidCredentials;
	
	public WebElement getUsername() {
		return username;  //WebElement is separate from java
	}
	public WebElement getPassword() {
		return password; //Not a string or char, Selenium data-type
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public WebElement getErrorMsgwinvalidCredentials() {
		return errorMsgwinvalidCredentials;
	}

}
