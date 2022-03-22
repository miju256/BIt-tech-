package ScreenShotConcepts;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListner.class)
public class ScreenShotTest extends BaseClass{
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		//failed();
	}
	
	@Test
	public void takeScreenShotTest() {
		AssertJUnit.assertTrue(false);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
