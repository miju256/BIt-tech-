package facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basetest.Shared;

public class Homepage {
	WebDriver driver;

	@FindBy(id="email") WebElement emailBox;
	@FindBy(id="pass") WebElement passBox;
	@FindBy(xpath="//*[@id=\"u_0_b\"]") WebElement lobinbtn;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public void provideEmail(String emailValue) {
	Shared.typeOnelement(emailBox, emailValue);
}

public void providepass(String value ) {
	Shared.typeOnelement(passBox, value);
}

public Userpage clickonloginbtn() {
	Shared.clickonelement(lobinbtn);
	return new Userpage(driver);
}

}
