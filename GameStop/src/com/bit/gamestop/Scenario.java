package com.bit.gamestop;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario {
FirefoxDriver dr;


public void gameStopTest() {
	dr.findElement(By.xpath("//a//span[text()='Account']")).click();//click on account 
	dr.findElement(By.xpath("//a//span[text()='Create Account']")).click();//click on create account
dr.findElement(By.xpath("//input[@id='registration-form-fname']")).sendKeys("miju");//first name
dr.findElement(By.xpath("//input[@id='registration-form-lname']")).sendKeys("sayeed");//last name 
dr.findElement(By.xpath("//div//input[@id='registration-form-email']")).sendKeys("miju915@gmail.com");//email 
dr.findElement(By.xpath("//div//input[@id='registration-form-password']")).sendKeys("miju123");//password

dr.findElement(By.xpath("//div//input[@id='registration-form-phone']")).sendKeys("22112331");//phone number
dr.findElement(By.xpath("//div[@class= 'col-8 create-account-submit']//button[@class='btn btn-block btn-primary'and @type='submit']")).click();
}

	
	
}
