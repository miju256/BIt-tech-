package com.bit.parameter.constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shared extends Scenario  {
	
	

	Shared(FirefoxDriver dr) {
		super(dr);
		
	}

	public void facebookTest() {
		CheckConstructor o = new CheckConstructor(dr);
		
		openBrowser();
		goToAnyWebsite("https://www.facebook.com/");
		//o.typeOn(By.id("u_f_b"), "miju");
		clickOnAnyElements(By.id("u_0_2"));
		
		selectAnything(dr.findElement(By.id("month")), "Mar");
		
	}

}
