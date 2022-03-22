package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Shared {
	public void tagetTest() throws InterruptedException {
		Scenario sc= new Scenario();
		sc.openBrowser();
		sc.goToTarget("https://www.target.com/");
	   // sc.getTile("Target : Expect More. Pay Less.");
		sc.getTile("Target : Expect More. Pay Less.");
		sc.typeOnAnyElements(By.xpath("//input[@id='search']"),"kids shoes");
		Thread.sleep(5000);
		sc.clickOnAnyElements(By.xpath("//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']"));
		
		//sc.selectDropDown();(how to use parameterize method with select.Do i need to do dr.find element and pass x path for each of the select bar. 
		sc.clickOnAnyElements(By.xpath("//h3[@class='Col-favj32-0 kVtFA-d']"));
		Thread.sleep(5000);
		sc.clickOnAnyElements(By.xpath("//button[@class='Button__ButtonWithStyles-y45r97-0 StyledButton__VariationButton-qhksha-0 dfIgEF']"));
		Thread.sleep(5000);
		
		sc.clickOnAnyElements(By.xpath("//div//button[@class='Button__ButtonWithStyles-y45r97-0 SwatchButton-sc-18yljzc-0 ePfKLm']//img"));
		Thread.sleep(5000);
		
		sc.clickOnAnyElements(By.xpath("//div[@class='Col-favj32-0 hBDuLy h-padding-l-tiny']//button[contains(text(),'Ship it') and @class='Button__ButtonWithStyles-y45r97-0 styles__StyledButton-sc-1f2lsll-0 fYQKtJ']"));
		Thread.sleep(5000);
		sc.clickOnAnyElements(By.xpath("//span[@class='sc-AxjAm cMlCfP' and@data-icon-name='NavigationCloseReverse']"));
		
		sc.clickOnAnyElements(By.xpath("//span[@class='sc-AxjAm hhuVxr']"));
		Thread.sleep(5000);
		sc.clickOnAnyElements(By.xpath("//button[contains(@class,'Button__ButtonWithStyles-y45r97-0 kqnQCZ')]")); Thread.sleep(5000);
		sc.typeOnAnyElements(By.xpath("//input[@id='username' and@name='username']"), "miju915@gmail.com"); Thread.sleep(5000);
		sc.typeOnAnyElements(By.xpath("//input[@id='password' and@name='password']"),"wfwfw");
		sc.clickOnAnyElements(By.xpath("//div//button[@id='login']"));
		
		//sc.selectDropDown(by, value);
		
		//WebElement button =
	}
		
	
	
	}

