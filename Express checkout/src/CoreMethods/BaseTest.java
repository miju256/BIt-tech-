package CoreMethods;

import java.util.List;

import org.openqa.selenium.WebElement;

import Browser.BrowserConfiguration;

public class BaseTest extends BrowserConfiguration {
	public static void clickOnAnyElements(WebElement ele) {
		ele.click();
		System.out.println("clicking on element");

	}

	public static void verifylogo(WebElement ele, String value) {
		boolean logoVerification = ele.getText().equals(value);
		System.out.println("is logo Present" + logoVerification);
	}

	public static void isEnable(WebElement ele) {
		boolean isEnable = ele.isEnabled();
		System.out.println("Is button enable" + isEnable);
	}
	
	public static void listOfWebelemet(List<WebElement> ele,int index) {
		ele.get(index).click();
	}

}
//have to go in different package.
//This one's name have to be shared