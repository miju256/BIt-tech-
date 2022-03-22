import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniton {
	WebDriver driver;
	@Given("^open browser$")
	public void open_browser()  {
	    driver = new FirefoxDriver();
	}

	@Then("^navigate to facebok url$")
	public void navigate_to_facebok_url()  {
	    driver.get("https://www.facebook.com/");
	}

	@When("^click on create an account$")
	public void click_on_create_an_account()  {
	    driver.findElement(By.id("u_0_2")).click();
	}
 
	@When("^user enters <\\\"([^\\\"]*)\\\"> and <\\\"([^\\\"]*)\\\">and<\\\"([^\\\"]*)\\\">and<\\\"([^\\\"]*)\\\">$")
	public void user_enters_firstname_lastname_email_newpassword(String firstname,String lastname , String email,String newpassword ) {
	    driver.findElement(By.name("firstname")).sendKeys(firstname);
	    driver.findElement(By.name("lastname")).sendKeys(lastname);
	    driver.findElement(By.name("lastname")).sendKeys(email);
	    driver.findElement(By.name("reg_passwd__")).sendKeys(newpassword);
	}

	@And("^user provides birthdate month$")
	public void user_provides_birthdate_month(WebElement ele)  {
		Select select = new Select(driver.findElement(By.name("birthday_month")));
	   select.selectByVisibleText("Oct");
	}

	@And("^birthdate date$")
	public void birthdate_date()  {
		Select select = new Select(driver.findElement(By.name("birthday_day")));
		   select.selectByVisibleText("27");
	}

	@And("^provides birthdate for year$")
	public void provides_birthdate_for_year()  {
		Select select = new Select(driver.findElement(By.name("birthday_year")));
		   select.selectByVisibleText("1993");
	    
	}
	@And("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}



}
