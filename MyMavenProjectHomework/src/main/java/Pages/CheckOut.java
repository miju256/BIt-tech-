package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SelemiumHelper.Helper;

public class CheckOut {
	WebDriver driver;
	
	public CheckOut(WebDriver driver ) {
		this.driver =driver;
	}
	
	public void clickCheckOut() {
		Helper.clickonAnyElement(driver.findElement(By.xpath("")));
		//driver.switchTo().frame(index)///find out 
	}
	
	
	
	
	

}
