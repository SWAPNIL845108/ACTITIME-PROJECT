package com.actitime.ObjectRepository;  //designing POM CLASSES INOBJECT REPOSITORY

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage 
//declaration
{
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement Addnewbtn;
	

	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	

	
	@FindBy(xpath ="//textarea[@placeholder='Enter Customer Description']")
			private WebElement custdscr;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement CancelButt;
	
	

	//Utilization
	
	public WebElement getAddnewbtn() 
	{
		return Addnewbtn ;
	}
	
	public WebElement getnewcust() 
	{
		return newcust;
	}
	
	public WebElement getcustname() 
	{
		return custname;
	}

	public WebElement getcustdscr() 
	{
		return custdscr;
	
	}
	

	public WebElement getCancelButt() 
	{
		return CancelButt;
	
	}
	
}


