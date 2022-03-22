package com.bit.gamestop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllMethod {
	
		 WebDriver dr=new FirefoxDriver() ;
		 
		 public void openBrowser() {
			  dr=new FirefoxDriver();
			  System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
		 }
		 public void clickOnAnyElemets(By locator) {
			 dr.findElement(locator).click();
		 }
		 public void typeOnAnyElements(By locator,String value) {
			 dr.findElement(locator).sendKeys(value);
		 }
		 
		 public void getTitle() {
			String t= dr.getTitle();
			boolean b=t.equals("Expeccted title ");
			System.out.println("title matched"+b);
		 }
		 
		 public void expectedTitle (String title) {
			 String t= dr.getTitle();
				boolean b=t.equals("Expeccted title ");
				System.out.println("title matched"+b);
			 
		 }
		 public void getCurrentUrl() {
			  String r= dr.getCurrentUrl();
					System.out.println(r);  
		 }
		 public void goToAnyWebsite(String url) {
			 dr.get(url);
			 
		 }
		 public void clickOnAnyElements2(WebElement x) {
			 x.click();
		 }
		 public void closeBrowser() throws InterruptedException {
			 dr.quit(); Thread.sleep(50000);
		 }
		 
		 
		 
}
