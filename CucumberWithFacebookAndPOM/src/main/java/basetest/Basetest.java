package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import facebook.pages.Homepage;
import junit.framework.Assert;



public class Basetest {
	
	 WebDriver driver;
	public void openBrowser(String browser ) {
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	
	public Homepage gotoWebsite() {
		driver.get("https://www.facebook.com/");
	return new Homepage(driver);
	}
	
	public void verifyTitle () {
		String title =driver.getTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up", title);
	}
	

}
