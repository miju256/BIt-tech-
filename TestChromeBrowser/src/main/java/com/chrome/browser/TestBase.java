package com.chrome.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	
		Thread.sleep(3000);
		driver.quit();
	}
}
