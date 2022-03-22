package com.old.navy.test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.navy.helper.Shared;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;
	@BeforeClass
	public static void readPropertiesfile() throws IOException {
		prop=  Shared.readPropertyfile("/Users/mdgulamkibria/Desktop/bit tech/OldNavyProject/"
				+ "config.properties");
	}
	
	@Before
	public static void openBrowser() {
	 String brow= prop.getProperty("browser");
	if(brow.equals("firefox")) {
		System.setProperty("werdriver.gecko.driver", "/Users/mdgulamkibria/Downloads"
				+ "/geckodriver");
		driver = new FirefoxDriver();
	}else if( brow.equals("chorome")) {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	}
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	
			
	}

}
