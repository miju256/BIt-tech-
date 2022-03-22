package coreMethod;

import org.junit.Test;
import org.openqa.selenium.By;

import browserConfiguration.Basetest;
import repo.ObjectRepository;
import repoValue.Value;
import utilityMethod.Shared;

public class SmokeTest  extends Basetest{
	@Test()
		public void uhcHomepageTittleVerification() {
			Shared.verifyTitle();
		}
	
	
	@Test
	public void ClickFindDoc() {
		Shared.clickOnAnyElement(By.xpath(ObjectRepository.findADocButton));
		
	
	}
	
	
	@Test
	public void clickFindAProvider() {
		Shared.clickOnAnyElement(By.xpath(ObjectRepository.findAProvider));
	}
	@Test
	public void clickonRegister() {
		Shared.clickOnAnyElement(By.xpath(ObjectRepository.registerNow));
	}
	@Test 
	public void typeOnFirstNAme() {
		Shared.typeOnAnyElements(By.cssSelector(ObjectRepository.firstName), Value.firstNAmeValue);
	}
	
	@Test
	public void typeOnLastName() {
		Shared .typeOnAnyElements(By.cssSelector(ObjectRepository.lastName), Value.lastNameValue);
	}
	@Test
	public void selectMonth() {
		Shared.dropDown(dr.findElement(By.xpath(ObjectRepository.monthBar)), Value.monthBar);
	}
	
	
}
