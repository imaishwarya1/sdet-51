package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OSA.genericutility.webDriverUtility;

public class AddtocartPage extends webDriverUtility {

	@FindBy(xpath="//a[text()='IPhone 14pro max']")
	private WebElement iphonelink;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[13]")
	private WebElement addtocartbtn;
	
	//initialization
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
     //utilization
	public WebElement getIphonelink() {
		return iphonelink;
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	//Business Libraries 
	public void AddtocartPagedetails() {
		
		addtocartbtn.click();
	}
	
	
}
