package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;

public class BaseClass {
	
	WebDriver driver;

public void openBrowser(String browser) {
	if(browser.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
	driver=new FirefoxDriver();
	}else if(browser.equals("chrome")) {
		driver= new ChromeDriver();
	}
	}
public HomePage gotoAnyWebsite() {
	driver.get("https://www.facebook.com/");
return new HomePage(driver);
}





}
