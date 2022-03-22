package FirstPackage;

import org.openqa.selenium.WebDriver;

import ApplicationStep.CoreStep;
import SeleniumHelper.Shared;

public class EndToEndTest {

	public static void main(String[] args) {
		BrowserConfigaration o = new BrowserConfigaration();
	WebDriver myDriver= o.openBrowser();
	
	CoreStep i = new CoreStep(myDriver);
	i.verifyHomepageLogo();
	i.clickOnMenu();
	
	

	
	
	
	
	
	
	}

}
