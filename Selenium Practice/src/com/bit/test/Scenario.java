package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario {
	
	 FirefoxDriver dr;
	
	public void openBrowser() {
    dr= new FirefoxDriver();	
    System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
	}
	
	public void goToTarget ( String url) {
		   dr.get(url);
		   System.out.println("got to any Website"+url);
	}
	public void islogoDisplayed( String logo ) {
		  dr.getCurrentUrl();
		
	}
	 public void getTile(String expectedtitle ) {
		 String t=dr.getTitle();
		    boolean b= t.equals(expectedtitle);
		    System.out.println("title matched"+b);
	 }
	 
	 public void getCurrentUrl() {
		  String h=dr.getCurrentUrl();
		
		
		System.out.println(h);
		
		 }
	 public void typeOnAnyElements(By locator, String value) {
		 dr.findElement(locator).sendKeys(value);
	 }
	  public void clickOnAnyElements(By by) {
		  dr.findElement(by).click();
	  }
	  
	  public void vefifyElementDisplayed(By locator) {
		boolean o=  dr.findElement(locator).isDisplayed();
		System.out.println("element displayed correct"+o);
	  }
	  
//	  public void selectDropDown(WebElement by, String value) {
//			 
//			Select x =new Select(by);
//			x.selectByVisibleText(value);
//		}
//
//	  public static void main(String[] args) {
//
//		    System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
//		    WebDriver driver = new FirefoxDriver();
//		    driver.get("https://www.amazon.com/");
//		    
//		    
//		    List<WebElement> elements = driver.findElements(By.xpath("//select[@id='searchDropdownBox']"));
//		    System.out.println("Number of elements:" +elements.size());
//
//		    System.out.println(elements.size());
////		    for (int i=0; i<elements.size();i++){
////		      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
////		    }
//		  }
 
		
	}
		
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
		 
	
	 
	

		
	


