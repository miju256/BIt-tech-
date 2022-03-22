package SmokeTest;

import org.junit.Test;
import org.openqa.selenium.By;

import browserConfiguration.BrowesrConfiguration;
import coreMethod.Shared;
import repo.RepoValue;

public class Scenario extends BrowesrConfiguration {

	@Test
	public void verifyAmazonLogo() {

		Shared.verifyElement(dr.findElement(By.xpath(RepoValue.amazonLogo)));
	}

	@Test
	public void countOfLinkInAmazon() {
		Shared.countOflinks(dr.findElement(By.tagName("a")));
	}

	@Test
	public void getDepartmentCount() {
		Shared.countofElement(dr.findElements(By.xpath(RepoValue.depCount)));
	}

//	@Test
//	public void selectAmazonDevices() {
//		Shared.dropDown(dr.findElement(By.xpath(RepoValue.selectBar)), RepoValue2.selectAmazon);
//
//	}
	@Test
	public void typeonSearchBar() {
		Shared.typeOnElement(By.xpath(RepoValue.searchBar), repo.RepoValue2.searchBarValue);
	
	}
	@Test
	public void clickonSearchBar() {
		Shared.clickOnElement(By.xpath(RepoValue.clicksearch));
	}
	
	@Test
	public void ifAlexaPresent() {
		Shared.verifyElement(dr.findElement(By.xpath(RepoValue.alexalogo)));
	
	}

}
