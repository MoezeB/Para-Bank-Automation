package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfigurations {

	public String getConfigurations(String key) throws Exception{
		//fileInput stream = serialization (Test data => stream)
		//3
		File file = new File("./Config.properties");
		
		//2
		FileInputStream fis = new FileInputStream(file);
		
		//1
		Properties prop = new Properties();
		prop.load(fis);
	
		String value = prop.get(key).toString();
		System.out.println(value);
		
		return value;
	}
	
	public static void main(String[] args) throws Exception {
		//need to call the get method here to view in console
		//check if the static word is there = Y/N
		//If static word not there create object of class not 
		//If static word is there, directly call using . method name
		//Object acts as blueprints of the class, instructing it on what methods to run
		
		BaseConfigurations obj = new BaseConfigurations();
		obj.getConfigurations("URL_Link");
		
		
		
	}
}

