package com.crm.objectRepository;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productcategwishlistPage {

//declaration
	
	@FindBy(xpath="//div[text()='Sub Categories']/../descendant::a[1]")
	private WebElement Televisionlink;
	
	@FindBy(xpath="//a[@title='Wishlist']")
	private WebElement Wishlistbtn; 
	
	
	
	
	




	//initialization
	public productcategwishlistPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	
	
//utilization
	public WebElement getTelevisionlink() {
		return Televisionlink;
	}
	
	public WebElement getWishlistbtn() {
		return Wishlistbtn;
	}

	
	
	
	//BusinessLibraries
	public void clickonTelevisionLink() {
		Televisionlink.click();
	}
	
	public void clickonWishlistBtn() {
		Wishlistbtn.click();
	}
	
}
