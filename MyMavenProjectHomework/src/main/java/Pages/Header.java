package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	WebDriver driver;
	@FindBy(id="")WebElement homePageLogo;
	@FindBy(id="")WebElement clickonShirt;
public Header(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}
}
