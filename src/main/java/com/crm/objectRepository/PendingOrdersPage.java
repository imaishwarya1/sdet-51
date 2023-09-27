package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OSA.genericutility.webDriverUtility;

public class PendingOrdersPage extends webDriverUtility {
	
	
	//declaration
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	private WebElement showDD;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchEdt;
	
	@FindBy(xpath="(//table/tbody/tr[*]/td[9]/a[@title='Update order'])[1]")
	private WebElement updateorderlink;
	
	
	@FindBy(xpath="//i[@class='icon-chevron-right shaded']")
	private WebElement nexticon;
	
	@FindBy(xpath="//a[@class='paginate_disabled_previous']")
	private WebElement previousicon;
	
	
	
	//initialization
	public PendingOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//utilization
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

	

	public WebElement getUpdateorderlink() {
		return updateorderlink;
	}

	//Business Libraries
	public void clickonupdateorderLink() {
		updateorderlink.click();
	}
	
	
}
