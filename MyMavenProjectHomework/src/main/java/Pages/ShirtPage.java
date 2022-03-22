package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SelemiumHelper.Helper;

public class ShirtPage {
	
	WebDriver driver;
	@FindBy(xpath="") WebElement clickOnShirt;
	public ShirtPage(WebDriver driver) {
		this .driver = driver;
		PageFactory.initElements(driver, this);
	}
	public  ExtraSlimShirtPage clickOnShirt() {
		Helper.clickonAnyElement(clickOnShirt);
	
		return new ExtraSlimShirtPage(driver);
		
		
	
	}
	
	
	


}
