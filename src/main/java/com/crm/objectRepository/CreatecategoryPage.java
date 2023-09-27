package com.crm.objectRepository;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OSA.genericutility.JavaUtility;
import com.OSA.genericutility.webDriverUtility;
import com.google.common.collect.Multiset.Entry;

public class CreatecategoryPage extends webDriverUtility {

	// declaration

	@FindBy(xpath = "//input[@name='category']")
	private WebElement categoryNameEdt;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement DescriptionEdt;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement CreateBtn;

	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
	private WebElement showDD;

	@FindBy(xpath = "//input[@aria-controls='DataTables_Table_0']")
	private WebElement searchEdt;

	@FindBy(xpath = "//i[@class='icon-chevron-right shaded']")
	private WebElement nexticon;

	@FindBy(xpath = "//i[@class='icon-chevron-left shaded']")
	private WebElement previousicon;

	// initialization

	public CreatecategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public WebElement getCategoryNameEdt() {
		return categoryNameEdt;
	}

	public WebElement getDescriptionEdt() {
		return DescriptionEdt;
	}

	public WebElement getCreateBtn() {
		return CreateBtn;
	}

	public WebElement getShowDD() {
		return showDD;
	}

	public WebElement getSearchEdt() {
		return searchEdt;
	}

	public WebElement getNexticon() {
		return nexticon;
	}

	public WebElement getPreviousicon() {
		return previousicon;
	}

	// Business Libraries

	public void createcateg(WebDriver driver, HashMap<String, String> map) {
		
		for(java.util.Map.Entry<String, String> set:map.entrySet())
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
		
//		categoryNameEdt.sendKeys(categName);
//		DescriptionEdt.sendKeys(desc);
        CreateBtn.click();
	
	}

	

}
