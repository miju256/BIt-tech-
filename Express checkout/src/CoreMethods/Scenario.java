package CoreMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Browser.BrowserConfiguration;
import Repo.ObjectRepository;
import Repo.TestData;

public class Scenario extends BrowserConfiguration {

	WebDriver dr;

	public Scenario(WebDriver dr) {
		this.dr = dr;
	}


	public void verifyExpressLogo() {
		BaseTest.verifylogo(dr.findElement(By.xpath(ObjectRepository.expressLogo)), TestData.expressvalue);
	}


	public void clickOnMen() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath(ObjectRepository.menButton)));
	}

	public void clickOnJeans() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath(ObjectRepository.jeansPic)));
	}

	
	public void verifyJeanstext() {
		BaseTest.verifylogo(dr.findElement(By.xpath(ObjectRepository.jeansPic)), TestData.jenasvalue);
	}

	
	public void clickOnColor() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath(ObjectRepository.jeansColor)));
	}


	public void clickOnSize() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath(ObjectRepository.selectWaist)));
	}
	
	public void selectlength() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath(ObjectRepository.selectLength)));

	}


	public void selectwaist() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath(ObjectRepository.selectWaist)));
	}

	public void checkbuttonEnable() {
		BaseTest.isEnable(dr.findElement(By.xpath(ObjectRepository.addToBagButton)));
	}

	
	public void clickOnaddToCart() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath(ObjectRepository.addToBagButton)));
	}

	
	public void clickonviewBag() {
		BaseTest.clickOnAnyElements(dr.findElement(By.xpath("")));// check again
	}

	
	public void verifyQuantity() {
		BaseTest.verifylogo(dr.findElement(By.xpath(ObjectRepository.quantity)), TestData.quantityValue);
	}

	
	public void getWebeleofjeans() {
		BaseTest.listOfWebelemet(dr.findElements(By.xpath(ObjectRepository.listOfEle)), TestData.listofjeans);
	}

}
