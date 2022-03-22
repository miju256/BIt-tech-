package com.bit.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import SelemiumHelper.Helper;

public class BaseTest {
	WebDriver driver;

	public static Properties prop;
@BeforeClass
	public static void configpropFile() throws FileNotFoundException, IOException {
		prop = Helper.redPropertiesFile(
				"/Users/mdgulamkibria/Desktop/bit tech/MyMavenProjectHomework/express.properties");

	}
@Before
	public void openBrowser() {
		String brow = prop.getProperty("browser");
		
		System.out.println(brow);
		if (brow.equals("FireFoxDriver")) {
			
			//System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
			driver = new FirefoxDriver();
		} else if (brow.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria/Downloads/chromedriver");
			driver = new ChromeDriver();
		} else if (brow.equals("SafariDriver")) {

			driver = new SafariDriver();

		}
		driver.get(prop.getProperty("url"));

	}

}
