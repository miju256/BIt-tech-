package Browser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfiguration  {
	public  static WebDriver dr;

	
	
	
	
public static  WebDriver openBrowser() {
		if (dr == null) {
			//System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
			
			
			//dr = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria/Downloads/chromedriver");
			dr= new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.get("https://www.express.com/");
		}
		

		return dr;

	}

	public void closeBrowser() {
		dr.quit();
	}
}
