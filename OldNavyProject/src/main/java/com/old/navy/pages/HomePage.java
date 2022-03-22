package com.old.navy.pages;

import org.openqa.selenium.WebDriver;

public class HomePage  {
	 WebDriver driver;
	 
	public  HomePage(WebDriver driver) {
		this.driver = driver;
	}
	 
	
public  String titleTest() {
	  String title=driver.getTitle();
return title;
}
 


}
