package com.actitime.TestScripts;

import org.testng.annotations.Test;

import com.actitime.ObjectRepository.HomePage;
import com.actitime.ObjectRepository.TaskPage;
import com.actitime.genriclibrary.BaseClass;
import com.actitime.genriclibrary.FileLibrary;

public class Task extends BaseClass
  {
	@Test
    public void CreateCustomer()
    {
    HomePage hp=new HomePage();
    hp.getTasktab().click();
    TaskPage tp=new TaskPage();
    tp.getAddnewbtn().click();
    tp.getnewcust().click();
    
    FileLibrary f=new FileLibrary();
 String CreateCustomer=   f.ReadDataFromExcel("Sheet1",2,1);
                         
    	
    	
    	
    	
    	
    }
}
