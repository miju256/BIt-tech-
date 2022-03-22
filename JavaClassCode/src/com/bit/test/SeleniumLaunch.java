package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria/Downloads/chromedriver 2");
		
		WebDriver dr= new FirefoxDriver();
		//WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		
		
	//	BaseTest bc =new BaseTest();
		
		//bc.macyCreate();
	}

}
