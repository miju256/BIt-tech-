package com.bit.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AllTest {
	
	FirefoxDriver dr; 
	
	
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads");
		
	}
	
	public void email() {
		WebDriver dr= new FirefoxDriver();
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("miju915@gmial.com");
	}
	
	
	public void firstName() {
		dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("yahia");
	}
	public void lastName() {
		dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("sayeed");
	}
	public void phone() {
		dr.findElement(By.id("#phone")).sendKeys("2424724234");
	}
	public void password() {
		
		dr.findElement(By.id("#password")).sendKeys("miju256");
		
	}
	public void agreementButton() {
		dr.findElementByClassName(".sc-kGXeez.fQexOT").click();
		
		}
	public void createAccount() {
		dr.findElement(By.xpath("//button[text()='Create account']")).click();
	}
	
	 public void printTitle () {
		  String t=dr.getTitle();
		  System.out.println(t);
	 }
	 public void getCurrentUrl() {
	
	String u=dr.getCurrentUrl();
		 System.out.println(u);
	 }
	 public void quit() {
			dr.quit();
		}


}
