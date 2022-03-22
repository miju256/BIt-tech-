package utilityMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import browserConfiguration.Basetest;

public class Shared extends Basetest {

	public static String  verifyTitle() {
		String currentTitle = dr.getCurrentUrl();
		System.out.println(currentTitle);
		return currentTitle;
		
		
		
	}
	
	public static void clickOnAnyElement(By locator) {
		dr.findElement(locator).click();
	
	}
	public static void typeOnAnyElements(By locator,String value) {
		dr.findElement(locator).sendKeys(value);
	
	}
	
	public static void dropDown(WebElement ele,String value ) {
		Select select =new Select(ele);
		select.selectByVisibleText(value);
	}

}
