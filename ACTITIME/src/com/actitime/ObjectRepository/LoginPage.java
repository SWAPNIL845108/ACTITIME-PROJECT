package com.actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
//Declaration
	@FindBy(id ="username")
	private WebElement abc;
	
	@FindBy(name ="pwd")
	private WebElement xyz ;
	
	
	@FindBy(xpath="//div[.=Login']")
	private WebElement pqr ;
	
	//Initialization
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization
	
	public WebElement getabc() 
	{
		return abc;
	}
	
	public WebElement getxyx() 
	{
		return xyz;
	}
	
	public WebElement getpqr() 
	{
		return pqr;
	}
}
