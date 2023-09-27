package com.crm.objectRepository;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertproductPage {

	//declaration
	@FindBy(name="category")
	private WebElement Categorydt;
	
	@FindBy(id="subcategory")
	private WebElement SubCategoryEdt;
	
	@FindBy(xpath="//input[@name='productName']")
	private WebElement ProductNameEdt;
	
	@FindBy(xpath="//input[@name='productCompany']")
	private WebElement ProductCompanyEdt;
	
	@FindBy(xpath="//input[@name='productpricebd']")
	private WebElement ProductpriceBDEdt;
	
	@FindBy(xpath="//input[@name='productprice']")
	private WebElement ProductPriceADEdt;
	
	@FindBy(xpath="//textarea[@name='productDescription']")
	private WebElement ProductDescEdt;
	
	@FindBy(xpath="//input[@name='productShippingcharge']")
	private WebElement ProductShipchargeEdt;
	
	@FindBy(id="productAvailability")
	private WebElement ProductAvailEdt;
	
	@FindBy(id="productimage1")
	private WebElement Productimag1;
	
	@FindBy(name="productimage2")
	private WebElement Productimag2;
	
	@FindBy(name="productimage3")
	private WebElement Productimag3;
	
	@FindBy(name="submit")
	private WebElement Insertbtn;
	
	
	
	//initialization 
	public InsertproductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization

	public WebElement getCategorydt() {
		return Categorydt;
	}



	public WebElement getSubCategoryEdt() {
		return SubCategoryEdt;
	}



	public WebElement getProductNameEdt() {
		return ProductNameEdt;
	}



	public WebElement getProductCompanyEdt() {
		return ProductCompanyEdt;
	}



	public WebElement getProductpriceBDEdt() {
		return ProductpriceBDEdt;
	}



	public WebElement getProductPriceADEdt() {
		return ProductPriceADEdt;
	}



	public WebElement getProductDescEdt() {
		return ProductDescEdt;
	}



	public WebElement getProductShipchargeEdt() {
		return ProductShipchargeEdt;
	}



	public WebElement getProductAvailEdt() {
		return ProductAvailEdt;
	}



	public WebElement getProductimag1() {
		return Productimag1;
	}



	public WebElement getProductimag2() {
		return Productimag2;
	}



	public WebElement getProductimag3() {
		return Productimag3;
	}



	public WebElement getInsertbtn() {
		return Insertbtn;
	}
	
	//Business Libraries 
	
	public void insertproduct() {
		 Productimag1.click();
		 Productimag2.click();
		 Productimag3.click();
		 Insertbtn.click();
		
	}
	
public void insertprodt(WebDriver driver, HashMap<String, String> map) {
		
		for(java.util.Map.Entry<String, String> set:map.entrySet())
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
		
	
	
	
	
	
	
	
	
}
}
