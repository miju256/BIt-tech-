package JunitBasics;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest {

	public static WebDriver dr;
@BeforeClass
	public static void setup() {
		if(dr==null) {
		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
		
		dr = new FirefoxDriver();
		dr.get("https://www.express.com/");
dr.manage().window().maximize();
dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		//return dr;
	}
@AfterClass
public static void closeBrowser() {
	dr.quit();
}



}
