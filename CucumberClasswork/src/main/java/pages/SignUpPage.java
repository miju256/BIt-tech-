package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Shared.Utility;

public class SignUpPage {
	WebDriver driver;
	@FindBy(name="u_t_b") WebElement firstName;
	@FindBy(id="u_t_d")WebElement lastName;
	@FindBy(id="u_t_g")WebElement mobileNum;
	@FindBy(id="password_step_input")WebElement pass;

	public SignUpPage(WebDriver driver ) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void typeonFirstName(String value) {
		Utility.typeOnElment(firstName, value);
	}
	
	
	
	
	
}
