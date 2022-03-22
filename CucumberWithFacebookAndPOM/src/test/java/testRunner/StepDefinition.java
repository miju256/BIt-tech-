package testRunner;

import java.util.List;

import org.openqa.selenium.WebDriver;
import basetest.Basetest;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import facebook.pages.Homepage;
import facebook.pages.Userpage;
import junit.framework.Assert;





public class StepDefinition {
	WebDriver driver;
	Basetest b = new Basetest();
	
Homepage homepage;
Userpage userpage;
	
	@Given("^user opens browser$")
	public void user_opens_browser(DataTable credintial)  {
		List<List<String>>browserValue= credintial.raw();
	  b.openBrowser(browserValue.get(0).get(1));
	 homepage= b.gotoWebsite();
	 
	  
	
	
	}

	

	@Given("^when user already in facebook page$")
	public void when_user_already_in_facebook_page()  {
	  b.verifyTitle();
	}
	

	@Then("^user provides his \"([^\"]*)\" id$")
	public void user_provides_his_email_id(String email) {
		//System.out.println("Email address is: " + email);
		homepage.provideEmail(email);
	    
	}

	@Then("^user gives his <\"([^\"]*)\">$")
	public void user_gives_his_password(String password)  {
		homepage.providepass(password);
	    
	}
	

	@Then("^user clicks on log in button$")
	public void user_clicks_on_log_in_button()  {
	    userpage=homepage.clickonloginbtn();
	}

	@Then("^user already in facebook userpage$")
	public void user_already_in_facebook_homepage() {
		userpage.verifyuserpage();
	}




}



	


