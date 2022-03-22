package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Shared.Utility;
import junit.framework.Assert;

public class HomePage {
	
	@FindBy(id="u_0_2")WebElement createbtn;
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public void verifyTitle() {
	String title =driver.getTitle();
	Assert.assertEquals("Facebook - Log In or Sign Up", title);
}
public SignUpPage clickOnCreateNewAccount() {
	Utility.clickOnELement(createbtn);
	return new SignUpPage(driver);
}


}
