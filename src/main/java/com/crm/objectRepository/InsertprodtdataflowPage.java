package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertprodtdataflowPage {

	
	
	//declaration
	
	@FindBy(name="category")
	private WebElement Categorydt;
	
	@FindBy(id="subcategory")
	private WebElement SubCategEdt;
	
	@FindBy(xpath="//input[@name='productName']")
	private WebElement ProdtNameEdt;
	
	@FindBy(xpath="//input[@name='productCompany']")
	private WebElement ProdtCompanyEdt;
	
	@FindBy(xpath="//input[@name='productpricebd']")
	private WebElement ProdtpriceBDEdt;
	
	@FindBy(xpath="//input[@name='productprice']")
	private WebElement ProdtPriceADEdt;
	
	@FindBy(xpath="//textarea[@name='productDescription']")
	private WebElement ProdtDescEdt;
	
	@FindBy(xpath="//input[@name='productShippingcharge']")
	private WebElement ProdtShipchargeEdt;
	
	@FindBy(id="productAvailability")
	private WebElement ProdtAvailEdt;
	
	@FindBy(id="productimage1")
	private WebElement Prodtimag1;
	
	@FindBy(name="productimage2")
	private WebElement Prodtimag2;
	
	@FindBy(name="productimage3")
	private WebElement Prodtimag3;
	
	@FindBy(name="submit")
	private WebElement insertbtn;
	
	@FindBy(xpath="(//a[text()='Change Image'])[3]")
	private WebElement changeimagbtn;
	
	
	
	
	//initialization
	
	public InsertprodtdataflowPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//utilization
	
	public WebElement getCategorydt() {
		return Categorydt;
	}

	public WebElement getSubCategEdt() {
		return SubCategEdt;
	}

	public WebElement getProdtNameEdt() {
		return ProdtNameEdt;
	}

	public WebElement getProdtCompanyEdt() {
		return ProdtCompanyEdt;
	}

	public WebElement getProdtpriceBDEdt() {
		return ProdtpriceBDEdt;
	}

	public WebElement getProdtPriceADEdt() {
		return ProdtPriceADEdt;
	}

	public WebElement getProdtDescEdt() {
		return ProdtDescEdt;
	}

	public WebElement getProdtShipchargeEdt() {
		return ProdtShipchargeEdt;
	}

	public WebElement getProdtAvailEdt() {
		return ProdtAvailEdt;
	}

	public WebElement getProdtimag1() {
		return Prodtimag1;
	}

	public WebElement getProdtimag2() {
		return Prodtimag2;
	}

	public WebElement getProdtimag3() {
		return Prodtimag3;
	}

	public WebElement getInsertbtn() {
		return insertbtn;
	}

	public WebElement getChangeimagbtn() {
		return changeimagbtn;
	}
	
	
	
	
	
}
