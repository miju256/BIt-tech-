package com.bit.phone;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import Phone.GeneralPhone;

public class MyIphone {
	FirefoxDriver dr;
	//GeneralPhone m = new GeneralPhone(dr);
	

	

	public MyIphone(FirefoxDriver dr) {
		this.dr= dr;
	}

	public static void iphoneSetting() {
		GeneralPhone o =new GeneralPhone("iPhone","Tmoblie",true,"Black",347);
	System.out.println(o);
	
	}
	
	public void clickon(By locator ) {
		dr.findElement(locator).click();
		System.out.println("click from My iphone page");
	
	}
	
	

	

}
