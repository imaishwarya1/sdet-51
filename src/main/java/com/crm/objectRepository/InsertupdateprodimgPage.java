package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertupdateprodimgPage {
     
	//declaration
	
	@FindBy(xpath="//input[@name='productName']")
	private WebElement prodnameEdt;
	
	@FindBy(xpath="//label[text()='Current Product Image1']")
	private WebElement currentprodimg1;
	
	@FindBy(name="productimage3")
	private WebElement choosefilebtn;
	
	//initialization
	
	public InsertupdateprodimgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	
	public WebElement getProdnameEdt() {
		return prodnameEdt;
	}

	public WebElement getCurrentprodimg1() {
		return currentprodimg1;
	}

	public WebElement getChoosefilebtn() {
		return choosefilebtn;
	}
	
	
	
	
	
}
