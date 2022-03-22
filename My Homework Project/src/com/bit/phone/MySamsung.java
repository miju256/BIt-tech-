package com.bit.phone;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Phone.GeneralPhone;

public class MySamsung {
	FirefoxDriver dr;
	public MySamsung(FirefoxDriver dr){
		this.dr= dr;
	}
		GeneralPhone g = new GeneralPhone("Samsung"," Metropcs",false ,"grey", 2342);
		
		public  void catchWebElements(List<WebElement> ele, int index) {
		ele.get(index);
		
	}
}
