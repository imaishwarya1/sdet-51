package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageprodsPage {

	//declaration
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchEdt;
	
	@FindBy(xpath="//i[@class='icon-edit']")
	private WebElement Editicon;
	
	
	//initialization
	
	public ManageprodsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

    //utilization
	
	
	public WebElement getSearchEdt() {
		return searchEdt;
	}


	public WebElement getEditicon() {
		return Editicon;
	}
	
	//Business Libraries
	public void ManageprodsPage(String prodtxt) {
		searchEdt.sendKeys(prodtxt);
		Editicon.click();
	}
	
	
	
	
	
	
}
