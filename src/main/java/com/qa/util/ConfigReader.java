package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;
	
	public Properties init_prop() {
		
		prop = new Properties();
		String file = "config.properties";
		
		try {
			FileInputStream ip = new FileInputStream(file);
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getConfig(String property)
	{
		return prop.getProperty(property);
	}
}
