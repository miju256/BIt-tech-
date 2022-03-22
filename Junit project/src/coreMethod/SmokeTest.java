package coreMethod;


import org.junit.Test;
import org.openqa.selenium.By;

import JunitBasics.Basetest;
import repo.ObjectRepository;
import utilityMethod.Shared;

public class SmokeTest extends Basetest {

	@Test
	public void expressLogoPresentTest() {
		Shared.verifylogo(By.xpath(ObjectRepository.expressLogo));
	
	}

	@Test
	public void clickmenButtonTest() {
		Shared.clickOnAnyElement(By.xpath(ObjectRepository.menButton));
	}

	@Test
	public void jeansPicTest() {
		Shared.clickOnAnyElement(By.xpath(ObjectRepository.jeanspic));
	}

	@Test
	public void clickFirstjeansTest() {
		Shared.clickOnAnyElement(By.xpath(ObjectRepository.firstjeans));

	}
	

}
