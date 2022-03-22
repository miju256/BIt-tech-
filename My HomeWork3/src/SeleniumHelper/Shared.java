package SeleniumHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Shared {
	
	public static boolean verifyElementPresent(WebElement element ) {
	return 	element.isDisplayed();
	}
	public static void clickOnElements(List<WebElement> element, int index) {
		 element.get(index).click();
	}
	public static WebElement anyActionOnElements(List<WebElement>element,int index) {
		 return element.get(index);
	}

}
