package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//declaration
	
	@FindBy(xpath="(//a[text()='Home'])[1]")
	private WebElement Homelink;
	
	@FindBy(xpath="(//a[text()=' Electronics'])[1]")
	private WebElement Electronicslink;
	
	@FindBy(xpath="//a[text()=' Fashion 888']")
    private WebElement Fashion888link;
	
	@FindBy(xpath="//a[text()='My Cart']")
	private WebElement Mycartlink;
	
	@FindBy(xpath="//a[text()='Wishlist']")
	private WebElement Mywishlistlink;
	
	
	@FindBy(xpath="//div[@class='head']/../descendant::a[1]")
	private WebElement Electronicscategorieslink;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Loginlink;
	

	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

    //utilization
	public WebElement getHomelink() {
		return Homelink;
	}


	public WebElement getElectronicslink() {
		return Electronicslink;
	}


	public WebElement getFashion888link() {
		return Fashion888link;
	}


	public WebElement getMycartlink() {
		return Mycartlink;
	}


	public WebElement getMywishlistlink() {
		return Mywishlistlink;
	}


	public WebElement getElectronicscategorieslink() {
		return Electronicscategorieslink;
	}
	
	

	public WebElement getLoginlink() {
		return Loginlink;
	}

	//Business Libraries
	public void clickonHomeLink() {
		Homelink.click();
	}
	
	public void clickonElectronicsLink() {
		Electronicslink.click();
	}
	
	public void clickonFashion888Link() {
		Fashion888link.click();
	}
	public void clickonmycartLink() {
		 Mycartlink.click();
	}
	public void clickonmywishlistLink() {
		Mywishlistlink.click();
	}
	public void clickonElectronicscategLink(){
		Electronicscategorieslink.click();
	}
	public void clickonloginLink() {
		Loginlink.click();
	}
}
