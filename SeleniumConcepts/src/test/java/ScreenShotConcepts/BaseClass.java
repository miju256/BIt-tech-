package ScreenShotConcepts;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static WebDriver  driver;
		public static void initialization() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS );
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
		}
		public void failed(String methodName) {
			File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File("/Users/mdgulamkibria/Desktop/bit tech/SeleniumConcepts/ScreenShots/"+methodName+".jpg"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

}
