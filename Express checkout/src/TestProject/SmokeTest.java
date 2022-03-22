package TestProject;

import Browser.BrowserConfiguration;
import CoreMethods.Scenario;

public class SmokeTest extends BrowserConfiguration {

	public static void main(String[] args) throws InterruptedException {
		openBrowser();

		Scenario sc = new Scenario(dr);
		sc.verifyExpressLogo();
		sc.clickOnMen();
		//sc.clickOnJeans();
		 sc.getWebeleofjeans();
		Thread.sleep(3000);
		sc.clickOnColor();
		sc.clickOnSize();
		sc.clickOnColor();
		sc.selectwaist();
		sc.checkbuttonEnable();
		sc.clickOnaddToCart();
		sc.clickonviewBag();
		sc.clickOnaddToCart();
		sc.verifyQuantity();

	}

}
