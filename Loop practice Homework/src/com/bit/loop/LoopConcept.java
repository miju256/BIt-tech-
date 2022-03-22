package com.bit.loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoopConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().deleteAllCookies();
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='nav-al-container']//div[@id='nav-al-your-account']/a"));
		
		Thread.sleep(3000);
		//System.out.println(ele);
		
		findElementsWithLoop(ele,"Your Account");
	}

public static void findElementsWithLoop(List<WebElement> ele,String value) throws InterruptedException {

	int size =ele.size();
	

	System.out.println(size);
	for(int i=1;i<=size;i++) {
	String text=ele.get(i).getText();
	Thread.sleep(3000);
	System.out.println(text);
	if(text.equals(value));
	ele.get(i).click();
	//driver.navigate().back();

}





}
}
