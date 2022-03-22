package Gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxGridtest {

	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("firefox");
		
	String url = "http://192.168.1.3:4444/wd/hub";
	WebDriver driver = new RemoteWebDriver(new URL(url),cap);
	driver .get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	driver .quit();
	}
}
