package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario {
	
	FirefoxDriver dr;
	
	
	public void typeOnanyElements(By locator,String value ) {
		dr.findElement(locator).sendKeys(value);
	}
	public void clickOnAnyElemets(By locator) {
		dr.findElement(locator).click();
	}
	public void getTitle (String url) {
		dr.get(url);
	}
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver","/Users/mdgulamkibria/Downloads/geckodriver");
		 
		 dr= new FirefoxDriver ();
	}
	
	public void closeBrowser() {
		dr.quit();
	}
	public void prtintTitle () {
		 String t= dr.getTitle();
	boolean a= t.equals("Best buy");
	System.out.println("title matched"+a);
	}
	
	
	public void verifyElemetsDisplayed(By locator) {
		boolean u =dr.findElement(locator).isDisplayed();
		System.out.println("is elments displayed"+u);
	}
		
		public void clickOnAnyElement2(WebElement ele) {
			//dr.findElement(By.xpath("")).click();
			ele.click();
		}
		
		
}
	

