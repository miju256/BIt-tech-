package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	WebDriver driver;
	

	@Given("^open browser$")
	public void open_browser()  {
		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
		driver = new FirefoxDriver();

	}

	@And("^navigate to url$")

	public void navigate_to_url() {
		driver.get("https://www.facebook.com/");

	}

	@When("^user type facebook userId in text box$")
	public void user_type_userId_i_text_box()  {
		driver.findElement(By.id("email")).sendKeys("userid");

	}

	@And("^user type their password in text box$")
	public void user_type_password_in_text_box()  {
		driver.findElement(By.id("email")).sendKeys("userid");

	}

	@And("^user click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.id("")).click();

	}

	@Then("^user should land his profile page$")
	public void user_should_land_his_profile_page()  {

	}

@Then("^user should not be landing his profile page$")
	public void user_should_not_be_landing_his_profile_page()  {

	} 

}
