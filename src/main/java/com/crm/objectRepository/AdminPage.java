package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	
	//declaration
	
	@FindBy(xpath="//a[@class='collapsed']")
	private WebElement ordersmanaglink;
	
	@FindBy(xpath="//a[text()=' Create Category ']")
	private WebElement createcateglink;
	
	@FindBy(xpath="//i[@class='menu-icon icon-paste']")
	private WebElement insertprodlink;
	
	@FindBy(xpath="//a[text()='Manage Products ']")
	private WebElement manageprodlink;
	
	@FindBy(xpath="//i[@class='menu-icon icon-signout']")
	private WebElement logout;
	
	@FindBy(xpath="(//i[@class='icon-tasks'])[2]")
	private WebElement pendingorderslink;
	
	
	
	//initialization
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getOrdersmanaglink() {
		return ordersmanaglink;
	}


	public WebElement getCreatecateglink() {
		return createcateglink;
	}


	public WebElement getInsertprodlink() {
		return insertprodlink;
	}


	public WebElement getManageprodlink() {
		return manageprodlink;
	}


	public WebElement getLogout() {
		return logout;
	}

	public WebElement getPendingorderslink() {
		return pendingorderslink;
	}
	
	
	
	
	
	//Business Libraries
	
	public void clickonordersmanagLink() {
		ordersmanaglink.click();
	}
	
	public void clickoncreatecategLink() {
		createcateglink.click();
	}
	
	public void clickoninsertprodLink() {
		insertprodlink.click();
	}
	
	public void clickonmanageprodLink() {
		manageprodlink.click();
	}
	
	public void logout() {
		logout.click();
	}

	public void movetoelement() {
		pendingorderslink.click();
	}
	
}



