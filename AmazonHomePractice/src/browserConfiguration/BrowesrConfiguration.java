package browserConfiguration;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowesrConfiguration {
	 public static WebDriver dr;
@BeforeClass
	public void openBrowser() {
		if (dr == null) {
			System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		dr.get("https://www.amazon.com/");
		}
	}
	@AfterClass
	public static void clocseBrowser() {
		dr.quit();
	}

}
