package browserConfiguration;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest {
	public static  WebDriver dr;
@BeforeClass
	public  static void openbrowser() {
		if (dr == null) {
			System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
			dr = new FirefoxDriver();
			dr.get("https://www.uhc.com/");
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			dr.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
			dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}


@AfterClass
public static void closeBrowser() {
	dr.quit();
}





}
