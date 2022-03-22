package com.bit.parameter.constructor;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckConstructor  {
	 FirefoxDriver dr;
	CheckConstructor(FirefoxDriver dr){
		this.dr =dr;
	}
	
	public void sample() {
		dr.findElement(By.id("")).clear();
	}
//	public void typeOn(By by,String value) {
//		dr.findElement(by).sendKeys(value);
//	}
	
	
}
