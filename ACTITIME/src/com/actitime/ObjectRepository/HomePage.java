package com.actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 

{
//declaration
	@FindBy(xpath="//div[.='Tasks']")
			private WebElement tasktab;
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement Reporttab;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement Userstab;
	
	@FindBy(id="logoutLink")
	private WebElement LogoutTab;
	
	//utilization

	public WebElement getTasktab() {
		return tasktab;
	}

	

	public WebElement getReporttab() {
		return Reporttab;
	}

	
	

	public WebElement getUserstab() {
		return Userstab;
	}

	

	public WebElement getLogoutTab() {
		return LogoutTab;
	}

	
	}
	
	
	

