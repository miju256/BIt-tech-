package com.bit.test;

import org.junit.Test;

import Pages.ExtraSlimShirtPage;
import Pages.HomePage;
import Pages.ShirtPage;

public class SmokeTest extends BaseTest {
	ShirtPage np;
	ExtraSlimShirtPage exp;
	@Test
	public void voijodf() {
		
	HomePage homepage= new HomePage(driver);
homepage.verifyHomePageLogo();
		np=homepage.clickOnShirt();
	exp= np.clickOnShirt();
	 
	 
	 
	
	}
	
	

}
