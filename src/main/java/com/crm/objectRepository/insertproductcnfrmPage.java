package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class insertproductcnfrmPage {

	//declaration
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement insertprdcnfrmtext;
	
	
	
	//initialization
	public insertproductcnfrmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getInsertprdcnfrmtext() {
		return insertprdcnfrmtext;
	}
	
	
	
	
	
	
	
	
	
	
	
}
