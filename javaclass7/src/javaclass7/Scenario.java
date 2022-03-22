package javaclass7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario {
	FirefoxDriver dr;
//	Basetest b =new Basetest(2005, "black", "Honda");
//	Basetest c = new Basetest(4, "Bmw");
//	Basetest a= new Basetest("Black",4);

public void openBrowse(FirefoxDriver dr) {
	this.dr=dr;
	}
public void typeOnAnyElements() {
	System.out.println("typing from type on any elements");
dr.findElement(By.id("email")).sendKeys("miju");
}

	
}
