package com.bit.parameter.constructor;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario {
	static FirefoxDriver dr;

	Scenario(FirefoxDriver dr) {
		this.dr = dr;
	}

	public void openBrowser() {
		System.setProperty("WebDriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
	}

	public void goToAnyWebsite(String url) {
		dr.get(url);

	}

	public void printTitle(String title) {
		String s = dr.getTitle();
		boolean o = s.equals(title);
		System.out.println("title matched" + o);

	}

	public void isDisplayed(By by) {
		boolean l = dr.findElement(by).isDisplayed();
		System.out.println("Element is displayed" + l);
	}

	public void typeOnAnyElements(By locator, String value) {
		dr.findElement(locator).sendKeys(value);
	}

	public void clickOnAnyElements(By locator) {
		dr.findElement(locator).click();
	}

	public void selectAnything(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);

	}

	public void abc() {

	}

}
