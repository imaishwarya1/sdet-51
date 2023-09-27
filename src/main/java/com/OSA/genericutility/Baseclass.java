package com.OSA.genericutility;

import java.sql.SQLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.objectRepository.AdminLoginPage;
import com.crm.objectRepository.AdminPage;

public class Baseclass {

	public DatabaseUtility dLib=new DatabaseUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib=new FileUtility();
	public JavaUtility jLib=new JavaUtility();
	public webDriverUtility wLib=new webDriverUtility();
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	
	
	@BeforeSuite
	public void configBS() throws Throwable 
	{
		dLib.connectToDB();
	System.out.println("...connect to Db..");
		
	}
	//@Parameters("browser")
	@BeforeClass
	public void configBC() throws Throwable
	{
		String BROWSER = fLib.getPropertyKeyValue("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		System.out.println("Launching Chrome Browser");
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println("Launching Firefox Browser");
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Launching Edge Browser");
		}
		else {
			System.out.println("..invalid browser..");
		}
		System.out.println("launch the browser");
		
		sdriver=driver;
		wLib.maximizeTheBrowser(driver);
	}
	
	
	@BeforeMethod
	public void configBM() throws Throwable 
	{
	String URL = fLib.getPropertyKeyValue("url");
	String USERNAME = fLib.getPropertyKeyValue("username");
	String PASSWORD =fLib.getPropertyKeyValue("password");
	
	driver.get(URL);
    wLib.waitUntilUrlLoads(driver, 10, URL);
    
    
    AdminLoginPage alp=new AdminLoginPage(driver);
    alp.AdminLogin(USERNAME, PASSWORD);
    System.out.println("login to application");
		
	}
	
	@AfterMethod
	public void configAM() {
		AdminPage ap=new AdminPage(driver);
		ap.logout();
		System.out.println("logout from the application");
	}
	
	@AfterClass
	public void configAC()
	{
		driver.quit();
		System.out.println("close the browser");
	}
	
	
	@AfterSuite
	public void configAS() throws Throwable
	{
		dLib.closeDB();
		System.out.println("close db connection");
	}
	
	
	
	
}
