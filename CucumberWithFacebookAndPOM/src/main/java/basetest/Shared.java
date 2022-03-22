package basetest;

import org.openqa.selenium.WebElement;

public class Shared {
	
	public static void typeOnelement(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void clickonelement(WebElement ele) {
		ele.click();
	}

}
