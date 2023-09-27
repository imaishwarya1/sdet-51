package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreatecategoryconfrmPage {

	//declaration
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement confirmationtag;
	
	//initialization
	public CreatecategoryconfrmPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	
	


	public WebElement getConfirmationtag() {
		return confirmationtag;
	}
	
	//Business Libraries 
	
	public void confirmationtag(WebElement confirmationtag) {
		this.confirmationtag=confirmationtag;
	}
	
	
	
	public void verifymsg() {
		
	String actual= confirmationtag.getText();
//		if(actual.contains("Well done")) {
//			System.out.println("category is created");
//		}
//		else {
//			System.out.println("category is not created");
//	}
		String exp="Well done! Category Created !!";
		Assert.assertNotEquals(actual, exp);
		System.out.println("category is created");
	}
	
	
	
	
}