package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
public static void main(String[] args) {
	 
	 
	BaseTest bc= new BaseTest();
	 bc.macysTest();
	
	 MacysJoint joint =new MacysJoint();
	 joint.cz(100, 200);
	 joint.ab("maryland", 11416);
}
	
	public void targetTest() {
		 ChromeDriver dr= new ChromeDriver();

		 //go to any website.
		 dr.get("https://www.target.com/");
		 //click on any element 

		dr.findElement(By.xpath("//a[@id='account' and @ class='Link-sc-1khjl8b-0 bTKAgl AccountLink-gx13jw-1 fQgmcT']")).click();
		dr.findElement(By.xpath("//a[@id='account' and @ class='Link-sc-1khjl8b-0 bTKAgl AccountLink-gx13jw-1 fQgmcT']")).click();

		//type on any elemets 
		dr.findElement(By.cssSelector("")).sendKeys("njjn");
		
		dr.quit();


	}
	
	public static void macysTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria/Downloads/chromedriver");
		ChromeDriver dr= new ChromeDriver();
	
	dr.get("https://www.macys.com/");
	
	
	dr.findElement(By.xpath("//input[@id='pw-input']")).sendKeys("miju123");
	
	
	}
	
	public static void macyCreate() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria/Downloads/chromedriver");
		//ChromeDriver dr= new ChromeDriver();
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
		dr.findElement(By.xpath("//input[@id='ca-profile-firstname']")).sendKeys("yahia");
		dr.findElement(By.cssSelector("#ca-profile-lastname")).sendKeys("sayeed");
		dr.findElement(By.cssSelector("input[name='email']")).sendKeys("yahiasayeed1@gmail.com");
		dr.findElement(By.id("ca-profile-password")).sendKeys("miju123");
		dr.findElement(By.xpath("//select[contains(@title,'Month')]")).click();
		dr.findElement(By.xpath("//select[contains(@name,'ca-profile-birth-day')]")).click();
		dr.findElement(By.xpath("//button[text()='create account']")).click();
		dr.quit();

	
	}
}
