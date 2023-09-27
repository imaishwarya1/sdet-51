package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productcategoriesPage {

	//declaration
	
	@FindBy(xpath="//div[text()='Sub Categories']")
	private WebElement subcateglink;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[13]")
	 private WebElement AddtocartBtn;
	
	//initialization
	
	public productcategoriesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getSubcateglink() {
		return subcateglink;
	}

	public WebElement getAddtocartBtn() {
		return AddtocartBtn;
	}
	
	//Business Libraries
	public void productcategoriesPage() {
		subcateglink.click();
		AddtocartBtn.click();
	}
	
	
	
}
