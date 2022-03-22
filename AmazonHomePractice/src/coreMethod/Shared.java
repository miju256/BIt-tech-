package coreMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import browserConfiguration.BrowesrConfiguration;

public class Shared extends BrowesrConfiguration {

	public static void verifyElement(WebElement ele) {
		boolean result = ele.isDisplayed();
		System.out.println("element is displayed " + result);
	}

	public static void countOflinks(WebElement ele) {
	 ele.getSize();
		System.out.println(ele.getSize());
	}
	public static void countofElement(List<WebElement> ele) {
		int size= ele.size();
		System.out.println("count of element is page is "+size);
	}
//	public static void dropDown(WebElement ele,String value) {//Why this is not working ?
//		 Select select= new Select(ele);
//		 select.selectByValue(value);
//	}
	public static void typeOnElement(By locator,String value) {
		dr.findElement(locator).sendKeys(value);
	}
	
	public static void clickOnElement(By locator){
		dr.findElement(locator).click();
	}


}
