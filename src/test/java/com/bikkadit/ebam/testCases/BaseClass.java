package com.bikkadit.ebam.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.bikkadit.ebam.Utilities.ReadConfig;

public class BaseClass {

  ReadConfig config = new ReadConfig();
  public static WebDriver driver;
  public static Logger logger;	
  
  public String baseUrl = config.getAppliactionURL();
	public String username = config.getusername();
	public String password = config.getPassword();
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		logger = Logger.getLogger("ebam");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver",config.getChromepath());
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",config.getfirefoxPath());
			driver=new FirefoxDriver();
			}
		
		driver.get(baseUrl);
		
		
//		//System.setProperty("webdriver.chrome.driver",config.getChromepath());
//	   System.setProperty("webdriver.chrome.driver", "C:\\Maven(Project)\\ebam\\Driver\\chromedriver.exe");
//	   // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
//		logger = Logger.getLogger("ebam");                                                                             // "./\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}


