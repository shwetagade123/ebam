package com.bikkadit.ebam.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is "+ e.getMessage());
		}
		
	}
	public String getAppliactionURL() {
		
		String url = pro.getProperty("baseUrl");
		return url;		
	}
	
	public String getusername() {
		
		String username = pro.getProperty("username");
		return username;		
	}
	public String getPassword() {
		
		String pwd = pro.getProperty("password");
		return pwd;		
	}
	public String getChromepath() {
		
		String chrome = pro.getProperty("chromepath");
		return chrome;		
	}
	public String getfirefoxPath() {
		
		String firefox = pro.getProperty("firefoxpath");
		return firefox;		
	}
	

}


