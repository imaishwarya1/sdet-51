package com.OSA.genericutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class webDriverUtility {
	
	/**
	 * This method is used to maximize the browser 
	 * @param driver
	 */
	
	
	public void maximizeTheBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
/**
 * This method is used to minimize the browser
 * @param driver
 */
	
	public void minimizeTheBrowser(WebDriver driver) {
		driver.manage().window().minimize();
		
	}
	
	/**
	 * This method will wait until elements in the page gets load 
	 * @param driver
	 * @param duration
	 */
	
	public void implicitWait(WebDriver driver,int duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	/**
	 * This method waits until the url of the page gets load
	 * @param driver
	 * @param duration
	 * @param expectedurl
	 */
	
	public void waitUntilUrlLoads(WebDriver driver,int duration,String expectedurl)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.urlContains(expectedurl));
	}
	
	/**
	 * This method will wait until the title of the page gets laod 
	 * @param driver
	 * @param duration
	 * @param expectedTitle
	 */
	public void waitUntilTitleLoads(WebDriver driver,int duration, String expectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.titleContains( expectedTitle));
	
}
	/**
	 * This method will wait until the element in the page gets load 
	 * @param driver
	 * @param duration
	 * @param element
	 */
	
	public void waitUntilElementToBeClickable(WebDriver driver,int duration,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	/**
	 * This method will ignore NoSuchElementException and continues the execution
	 * @param driver
	 * @param duration
	 */
	
	public void ignoreNoSuchElementException(WebDriver driver,int duration) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
	}
	/**
	 * This method will wait until the element to be visible in the page 
	 * @param element
	 * @throws InterruptedException
	 */
	public void customWait(WebElement element)throws InterruptedException{
		int count=0;
		while(count<20) {
			try {
				element.click();
				break;
				}
		catch (Exception e) {
			Thread.sleep(1000);
			count++;
		}
	}}
	/**
	 * This method will select a dropdown element based on index
	 * @param element
	 * @param value
	 */
	public void selectDropDown(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);;
	}
	
	/**
	 * This method will select a dropdown element based on value
	 * @param element
	 * @param value
	 */
	public void selectDropDown(WebElement element, String value ) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This method will select a dropdown element based on visible Text
	 * @param element
	 * @param text
	 */
	public void selectDropDown(String text ,WebElement element ) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * This method is used to mouse over on an element
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This method is used to right click on the element
	 * @param driver
	 * @param element
	 */
	
	public void rightClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This method is used to click on enter button 
	 * @param driver
	 */

	public void clickOnEnterKey(WebDriver driver) {
		
		Actions act=new Actions(driver);
       act.sendKeys(Keys.ENTER).perform();
	}
	/**
	 * This method is used to switch from one frame to another frame using index
	 * @param driver
	 * @param index
	 */
	public void switchFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch from one frame to another frame using id
	 * @param driver
	 * @param id
	 */
	public void switchFrame(WebDriver driver,String id) {
		driver.switchTo().frame(id);
	}
	/**
	 * This method is used to switch from one frame to another frame using webElement
	 * @param driver
	 * @param element
	 */
	public void switchFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch to main frame 
	 * @param driver
	 */
	public void switchToMainFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to a accept alert popup
	 * @param driver
	 * @param expectedMsg
	 */
	public void acceptAlertPopup(WebDriver driver, String expectedMsg) {
	Alert alert = driver.switchTo().alert();
	if(alert.getText().equalsIgnoreCase(expectedMsg)) {
		System.out.println("alert msg is verified ");
	}
	else {
		System.out.println("alert msg is not verified ");
	}
	alert.accept();
	}
	/**
	 * This method is used to a dismiss alert popup
	 * @param driver
	 * @param expectedMsg
	 */
	public void dismissAlertPopup(WebDriver driver, String expectedMsg) {
		Alert alert = driver.switchTo().alert();
		if(alert.getText().equalsIgnoreCase(expectedMsg)) {
			System.out.println("alert msg is verified ");
		}
		else {
			System.out.println("alert msg is not verified ");
		}
		alert.dismiss();
	}
	/**
	 * This method is used to switch from one window to another window based on title
	 * @param driver
	 * @param expectedTitle
	 */
	public void switchWindowBasedOnTitle(WebDriver driver, String expectedTitle) {
		
		Set<String> set = driver.getWindowHandles();
		for(String str:set) {
			driver.switchTo().window(str);
			String title = driver.getTitle();
			if(title.contains(expectedTitle)) {
				break;
			}
		}}
	/**
	 * This method is used to switch from one window to another based on the url
	 * @param driver
	 * @param expectedURL
	 */
		public void switchWindowBasedOnUrl(WebDriver driver, String expectedURL) {
			
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				String wid=it.next();
				driver.switchTo().window(wid);
				String url = driver.getCurrentUrl();
				if(url.contains(expectedURL));
				{
					break;
				}}
			
		}
		/**
		 * This method is used to take screenshot whenever testcripts are getting failed
		 * @param driver
		 * @param screenShotName
		 * @return
		 */
	public static  String takeScreenShot(WebDriver driver,String screenShotName) {
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshots/"+screenShotName+".png");
		try {
			Files.copy(src, dst);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return screenShotName;
		}
	
	/** 
	 * This method is used to scroll to particular element 
	 * @param driver
	 * @param element
	 */
		public void scrollToParticularElement(WebDriver driver,WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()",element);
		}
		
		/**
		 * This method will press enter key 
		 * @param driver
		 * @throws Throwable
		 */
		
		
		public void enterKey(WebDriver driver) throws Throwable {
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
		}
		
		
		/**
		 * This method is used to release the key 
		 * @param driver
		 * @throws Throwable
		 */
		
    public void enterRelease(WebDriver driver) throws Throwable
    {
	Robot rb=new Robot();
	rb.keyRelease(KeyEvent.VK_ENTER);
	
    }
    
    /**
     * This method is used to drag and drop 
     * @param driver
     * @param src
     * @param dst
     */
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dst) 
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst);
		
	}
	/**
	 * This method performs random scroll			
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollBarAction(WebDriver driver, int x, int y) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(x,y)", "");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
