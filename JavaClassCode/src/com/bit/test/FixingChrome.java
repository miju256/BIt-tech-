package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FixingChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria/Downloads/chromedriver");
        WebDriver dr = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver 2");
		//WebDriver dr= new FirefoxDriver();
		
		dr.get("https://www.facebook.com/");
		dr.findElement(By.name("email")).sendKeys("emon");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        dr.close();

		
	
	}
	

}
