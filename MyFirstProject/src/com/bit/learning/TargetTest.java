package com.bit.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TargetTest {
	
	
	public void targetTest(){
		
		
		WebDriver dr= new FirefoxDriver ();
		
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("miju915@gmial.com");
		// email.
		dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("yahia");
	// First name.
		dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("sayeed");
		//last name 
		dr.findElement(By.id("#phone")).sendKeys("2424724234");//phone 
		dr.findElement(By.id("#password")).sendKeys("miju256");//password.
		dr.findElement(By.className(".sc-kGXeez.fQexOT")).click();//agreement button
	dr.findElement(By.xpath("//button[text()='Create account']")).click();//create account button.
	
	}

}
