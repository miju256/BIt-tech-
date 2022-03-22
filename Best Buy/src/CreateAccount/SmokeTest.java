package CreateAccount;

import org.openqa.selenium.By;

public class SmokeTest {
	
	
	public static void main(String[] args) {
		Scenario sc= new Scenario();
		//BaseTest bc= new BaseTest();
		sc.openBrowser();
		sc.getTitle("https://www.bestbuy.com/");
		sc.clickOnAnyElemets(By.xpath("//span[text()='Account']"));
		sc.clickOnAnyElemets(By.xpath("//button[text()='Create Account']"));
		sc.typeOnanyElements(By.xpath("//input[@id='firstName']"), "miju");
		sc.typeOnanyElements(By.xpath("//input[@id='lastName']"), "Sayeed");
		sc.typeOnanyElements(By.xpath("//input[@id='email']"), "miju915@gmail.com");
		sc.typeOnanyElements(By.xpath("//input[@id='fld-p1']"), "miju256");
		sc.typeOnanyElements(By.xpath("//input[@id='reenterPassword']"), "miju256");
		sc.typeOnanyElements(By.xpath("//input[@id='phone']"), "345665646");
		sc.clickOnAnyElemets(By.xpath("//i[@class='c-checkbox-custom-input']"));
		sc.clickOnAnyElemets(By.xpath("//button[text()='Create an Account']"));
		sc.closeBrowser();
		
		
		
	}

}
