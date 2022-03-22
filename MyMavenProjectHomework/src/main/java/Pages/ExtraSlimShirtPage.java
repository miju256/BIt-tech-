package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SelemiumHelper.Helper;

public class ExtraSlimShirtPage {
	WebDriver driver;
	
	@FindBy (xpath="") WebElement clickColor;
	@FindBy (xpath="") WebElement clickSize;
	@FindBy (xpath="") WebElement clickOnAddBag;
	@FindBy (xpath="") WebElement  clickBagButton;
	
	public ExtraSlimShirtPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnColor() {
		Helper.clickonAnyElement(clickColor);
	}
	public void clickonSize() {
		Helper.clickonAnyElement(clickSize);
	}
	public void clickOnAddToBag() {
		Helper.clickonAnyElement(clickOnAddBag);
	}
	public CheckOut clickOnBagButton() {
		Helper.clickonAnyElement(clickBagButton);
		return new CheckOut(driver);
		
	}
	
	
	
	

}
