package com.actitime.genriclibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLibrary {
	public String ReadDataFromPropertyFile(String Key) throws IOException {
	
	FileInputStream fis=new FileInputStream("./Myfolder/CommonData.property");
	Properties p=new Properties();
	p.load(fis);
    String Value = p.getProperty(Key);
    return Value;
    
	}
	

}

