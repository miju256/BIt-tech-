package com.bit.gamestop;

import org.openqa.selenium.By;

public class SmokeTest {
	public static void main(String[] args) throws InterruptedException {
		AllMethod u =new AllMethod ();
		
		u.openBrowser();
		u.goToAnyWebsite("https://www.gamestop.com/");
		u.clickOnAnyElemets(By.xpath("//a//span[text()='Account']"));
		u.clickOnAnyElemets(By.xpath("//div[@class='header-account-options tulsa-acclink-toggle']"));
		u.typeOnAnyElements(By.xpath("//input[@id='registration-form-fname']"), "miju");
		u.typeOnAnyElements(By.xpath("//input[@id='registration-form-lname']"), "sayeed");
		u.typeOnAnyElements(By.xpath("//div//input[@id='registration-form-email']"), "miju915@gmail.com");
		u.typeOnAnyElements(By.xpath("//div//input[@id='registration-form-password']"), "miju123");
		u.typeOnAnyElements(By.xpath("//div//input[@id='registration-form-phone']"), "2347249");
		u.closeBrowser();
	}
}
