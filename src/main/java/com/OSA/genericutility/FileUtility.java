package com.OSA.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getPropertyKeyValue(String key) throws Throwable{
		FileInputStream fis=new FileInputStream(IpathConstants.propertypath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
		
		
		
	}
}
