package com.bit.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class scenario  {
	FirefoxDriver Dr;
	
	public void openBrowser() {
		Dr= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
}
	
	public void goToAnWebsite(String url){
		 Dr.get(url);
	}
	public void printTitle() {
		 String s=Dr.getTitle();
		 System.out.println(s);
		
	}
	
	public void getCurrentUrl() {
		String o =Dr.getCurrentUrl();
		System.out.println(o);
		
	}
	public void typeOnAnyElements(By locator,String value) {
		Dr.findElement(locator).sendKeys(value);
		
	}
	public void clickOnAnyElements(By locator) {
		Dr.findElement(locator).click();
		
	}
	public void getAnyText(By by,String expectedtext) {
		String l =Dr.findElement(by).getText();
		boolean x= l.contains("expectedtext");
		System.out.println("text matched"+x);
		
	}
	
	public void selectDropDown(WebElement element, String value  ) {
		 
		Select select =new Select(element);
		select.selectByVisibleText(value);
	}
	
	
	
	

}
