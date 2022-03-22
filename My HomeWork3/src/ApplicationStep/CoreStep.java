package ApplicationStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumHelper.Shared;

public class CoreStep {
	WebDriver driver;
	
	public CoreStep(WebDriver dr) {
		driver=dr;
	}
	
	public boolean verifyHomepageLogo(){
		 boolean result=Shared.verifyElementPresent(driver.findElement(By.xpath("//a[@aria-label='express Logo']//img[@src='/content/dam/logos-fonts/logos/express/express-logo.svg' and @alt='Express']")));
		
		 if(result) {
			 
			 System.out.println("Element is present");
		 }
		 else {
			 
			 System.out.println("Element is not present");
		 }
		 
		 
		 return result;
		
		
		
		
		
		
		
	}
	public void clickOnMenu() {
		Shared.clickOnElements(driver.findElements(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']")), 2);
	}
	

}




	
	


