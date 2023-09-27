package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProdtwishconfrmPage {

	@FindBy(xpath="//th[text()='my wishlist']")
	private WebElement Wishlisttxt;
	
	//initialization
	public ProdtwishconfrmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getWishlisttxt() {
		return Wishlisttxt;
	}
	
	
	//Business Libraries
	public void Wishlisttxt(WebElement  Wishlisttxt) {
		this. Wishlisttxt= Wishlisttxt;
	}
	
	
	
	public void verifywishlistmsg() {
		
		String actual=  Wishlisttxt.getText();
		//if(actual.contains("MY WISHLIST")) {
			///System.out.println("product is added to wishlist");
		//}
		//else {
			//System.out.println("product is not added to wishlist");
		
		//}
		String exp="MY WISHLIST";
	Assert.assertEquals(actual, exp);
	System.out.println("product is added to wishlist");
	}
}
