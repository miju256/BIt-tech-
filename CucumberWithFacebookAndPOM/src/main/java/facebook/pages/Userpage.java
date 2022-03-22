package facebook.pages;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Userpage {
	WebDriver driver ;
	public Userpage(WebDriver driver) {
		this.driver=driver;
	}

	public void verifyuserpage() {
		String title =driver .getTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up", title);
	
	}
}
