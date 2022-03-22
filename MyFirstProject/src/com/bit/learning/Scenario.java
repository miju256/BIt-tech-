package com.bit.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario {
	
		
		FirefoxDriver dr;
		
	 	
		public void openBrowser() {
			System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckoriver");
			dr = new FirefoxDriver();
			
			
		}
		
		public void email(By locator, String value ) {
			WebDriver dr= new FirefoxDriver();
			dr.findElement(By.xpath("//input[@id='username']")).sendKeys("miju915@gmial.com");
		}
		
		
		public void firstName(By xpath, String firstname) {
			dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("yahia");
		}
		public void lastName(By xpath ,String lastname ) throws InterruptedException {
			Thread.sleep(5000);
			dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("sayeed");
		}
		public void phone(By id, String phone ) {
			dr.findElement(By.id("#phone")).sendKeys("2424724234");
		}
		public void password(By id,String password) {
			
			dr.findElement(By.id("#password")).sendKeys("miju256");
			
		}
		public void agreementButton(By locator) {
			dr.findElementByClassName(".sc-kGXeez.fQexOT").click();
			
			}
		public void createAccount(By xpath ) {
			dr.findElement(By.xpath("//button[text()='Create account']")).click();
		}
		
		 public void printTitle (String title ) {
			  String t=dr.getTitle();
			  System.out.println(t);
		 }
		 public void getCurrentUrl(String url) {
		
		String u=dr.getCurrentUrl();
			 System.out.println(u);
		 }
		 public void quit() {
				dr.quit();
			}
		 public void getUrl(String url) {
			 dr.get("https://www.facebook.com/");
		 }


	}


