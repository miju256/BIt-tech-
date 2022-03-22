package utilityMethod;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import JunitBasics.Basetest;

public class Shared extends Basetest{
	//static WebDriver dr;

	public static  void typeOnAnyEle(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void clickOnAnyElement(By locator) {
		dr.findElement(locator).click();
	}

	public static void slectDropDown(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}

	public static void findElementFromList(List<WebElement> ele, int index) {
		ele.get(index).click();
	}

	public static boolean verifylogo(By locator) {
		boolean result = dr.findElement(locator).isDisplayed();

		if (result) {
			System.out.println("logo  is present ");
		} else {
			System.out.println("logo in not pesent");
		}
		return result;
	}
	public void islogoEnable(By locator ) {
	boolean enable=	dr.findElement(locator).isEnabled();
	System.out.println("logo is enable"+enable);
	}

}
