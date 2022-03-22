package Gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("Firefox");
		String url ="http://192.168.1.49:4444/wd/hub";
				
	WebDriver driver = new RemoteWebDriver(new URL(url),cap);
	
	
	}

}
