package Shared;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	WebDriver driver;
	public static void clickOnELement(WebElement ele) {
		ele.click();
	}
	public static void typeOnElment(WebElement ele, String value) {
	ele.sendKeys(value);
	}

}
