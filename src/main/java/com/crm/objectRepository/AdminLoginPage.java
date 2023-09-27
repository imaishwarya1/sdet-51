package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OSA.genericutility.webDriverUtility;

public class AdminLoginPage  {
	
	
	//declaration
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameEdt;
	
	@FindBy(id="inputPassword")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement LoginBtn;
	
	
	
   //initialization
	public AdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	//utilization 

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}



	public WebElement getPasswordEdt() {
		return passwordEdt;
	}



	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	//Business Libraries
	
	public void AdminLogin(String username,String password) {
		 usernameEdt.sendKeys(username);
		 passwordEdt.sendKeys(password);
		 LoginBtn.click();
		 
	}
	
	
	
	
	
}

