package com.crm.objectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OSA.genericutility.webDriverUtility;

public class updatecomplaintPage extends webDriverUtility {

	
	
	//declaration
	@FindBy(xpath="//select[@name='status']")
	private WebElement statusDD;
	
	
	@FindBy(xpath="//textarea[@name='remark']")
	private WebElement remarkEdt;
	
	@FindBy(xpath="//input[@name='submit2']")
	private WebElement updatebtn;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement closewindowbtn;
	
	
	//initialization
	
	public updatecomplaintPage(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}


	
	//utilization 
	public WebElement getStatusDD() {
		return statusDD;
	}


	public WebElement getRemarkEdt() {
		return remarkEdt;
	}


	public WebElement getUpdatebtn() {
		return updatebtn;
	}


	public WebElement getClosewindowbtn() {
		return closewindowbtn;
	}
	
   //Business Libraries 
public void updatecomplaint(WebDriver driver, HashMap<String, String> map,String status) {
		
		
		for( Entry<String, String> set:map.entrySet())
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
	
	selectDropDownByVisibleText(statusDD,status);
	updatebtn.click();
	
	

		
}



private void selectDropDownByVisibleText(WebElement statusDD, String status) {
	// TODO Auto-generated method stub
	
}
}
