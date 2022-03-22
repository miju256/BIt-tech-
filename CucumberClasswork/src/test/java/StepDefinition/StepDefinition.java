package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Shared.Utility;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.SignUpPage;

public class StepDefinition {
	WebDriver driver; 
	BaseClass b= new BaseClass ();
	HomePage hp= new HomePage(driver);
	SignUpPage sp;
	@Given("^user verify homepage$")
public void user_Verify_Homepage(DataTable credintial) {
	List<List<String>> data	=credintial.raw();
	b.openBrowser(data.get(0).get(0));
	hp=b.gotoAnyWebsite();
	hp.verifyTitle();
	
	
		
	}

@When("^user clicks on creata an account$")
public void user_clicks_on_creata_an_account()  {
 sp= hp.clickOnCreateNewAccount();
}


@When("^user provides <\"([^\"]*)\">and <\"([^\"]*)\">$")
public void user_provides_and(String arg1, String arg2)  {
    sp.typeonFirstName(value);
}

@And("^user puts his mobile numbser$")
public void user_puts_his_mobile_numbser() {
   
}

@Then("^user gives new password$")
public void user_gives_new_password() {
    
}


}
