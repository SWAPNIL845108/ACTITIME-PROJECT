package com.actitime.genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass
{
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection()
	{
		Reporter.log("database is connected", true);
	}

	@BeforeTest
	public void LaunchBrowser()
	{
		 driver=new ChromeDriver();
		Reporter.log("browser is launched",true);
	}
		@BeforeMethod
		public void LoginIntoActitime()
		{
	        
			Reporter.log("login into actitime is successful",true);
		}
		@AfterMethod
		public void LogoutFromActitime()
		{
			Reporter.log("Successfully Logeed out from Actitime",true);
		}
		@AfterTest
		public void CloseBrowser()
		{

			Reporter.log("Browser is closed",true);
		}
		@AfterSuite
		public void DiconnectDatabase()
		{
			Reporter.log("Database is disconnected",true);
		}
		
	}

