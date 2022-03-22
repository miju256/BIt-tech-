package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	WebDriver driver;
@FindBy (xpath="")WebElement sales;
@FindBy (xpath="") WebElement contactUs;
public Footer(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}
}
