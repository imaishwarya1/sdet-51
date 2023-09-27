package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

	
	//declaration
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Emailaddress;
	
	@FindBy(xpath="//input[@id='exampleInputPassword1']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement Loginbtn;
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getEmailaddresslink() {
		return Emailaddress;
	}

	public WebElement getPasswordEdt() {
		return password;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	
	//Business Libraries
	
	public void Login(String EMAIL, String PWD) {
		
		Emailaddress.sendKeys(EMAIL);
		password.sendKeys(PWD);
		Loginbtn.click();
		
		
		
	}
}
