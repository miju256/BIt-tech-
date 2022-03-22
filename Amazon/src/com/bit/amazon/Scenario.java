package com.bit.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario {
	
	FirefoxDriver dr;
	public void openBrowser() {
		 dr= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","/Users/mdgulamkibria/Downloads/geckodriver");
	}
	public void goToAnyWebsite( String url) {
		dr.get(url);
		
	}
	
	public void typeOnAnyElements (By locator,String value ) {
	dr.findElement(locator).sendKeys(value);
	System.out.println("element is typed "+ locator);
	}
	
	public void clickOnAnyElemets(By locator ) {
		dr.findElement(locator).click();
		System.out.println("emement displayed"+locator );
	}
		
		public void printTitle( String expectedtitle ) {
			 String u= dr.getTitle();
			boolean b= u.equals(expectedtitle);
			System.out.println("my title matched "+b);
			}
			
			public void printCurrentUrl() {
				
			String i= dr.getCurrentUrl();
			System.out.println("current element is displayed"+i);
		}
			
			public void dropDownSelect(WebElement ele ,String value) {
				
				Select s= new Select(ele);
				s.selectByVisibleText("");
				
			}
			
			public void IsDisplayed (By locator ) {
				
				 boolean o=dr.findElement(locator).isDisplayed();
				 System.out.println("element displayed"+o);
			}
			
			

}
