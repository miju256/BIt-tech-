package FirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfigaration {
	FirefoxDriver dr;

	public WebDriver openBrowser() {
		if(dr==null) {
		dr= new FirefoxDriver();
		
		dr.get("https://www.express.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		return dr;
	}
}
