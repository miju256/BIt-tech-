package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import SelemiumHelper.Helper;
 
public class HomePage extends LoadableComponent<HomePage> {
	WebDriver driver;
	
	 @FindBy(xpath="")WebElement homePageLogo;
	 @FindBy(xpath="") WebElement clickShirt;
	public HomePage(WebDriver driver) {
		 this.driver =driver;
		 PageFactory.initElements(driver, this);
	 }
	
	public  void verifyHomePageLogo() {
		Helper.verify(homePageLogo);
	}
	
//	public void clickOnSale() {
//		Helper.actionclass(driver.findElement(By.xpath("")));
//	}
	
	public ShirtPage clickOnShirt() {
		Helper.clickonAnyElement(clickShirt);
	return new ShirtPage(driver);
	}

@Override
protected void load() {
	// TODO Auto-generated method stub
	driver.navigate().to("https://www.express.com/mens-clothing/sale/clearance/cat890006/filter/type_uFilter:Blazer%7CCasual%20Shirt%7CGraphic%20Tee%7CDress%20Shirt%7CHoodies%20&%20Sweatshirts%7CPolos%7CSuit%20Jacket%7CSuit%20Vest%7CTees%20&%20Henleys");
Header head = new Header(driver);

}

@Override
protected void isLoaded() throws Error {
	// TODO Auto-generated method stub
	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/mens-clothing/sale/clearance/cat890006/filter/type_uFilter:Blazer%7CCasual%20Shirt%7CGraphic%20Tee%7CDress%20Shirt%7CHoodies%20&%20Sweatshirts%7CPolos%7CSuit%20Jacket%7CSuit%20Vest%7CTees%20&%20Henleys"));
	Header head = new Header(driver);//what was the purpose of creating this object inside this method 
}
	
	
	
	
	
	
	

}
