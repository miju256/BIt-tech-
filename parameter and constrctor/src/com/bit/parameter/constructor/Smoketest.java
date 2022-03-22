package com.bit.parameter.constructor;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Smoketest extends Scenario{
	
	
	Smoketest(FirefoxDriver dr) {
		super(dr);
	}

	//static FirefoxDriver dr;
	public static void main(String[] args ){
		
		CheckConstructor o= new CheckConstructor(dr);
		o.sample();
		
		Shared s = new Shared(dr);
		
		s.facebookTest();
	

	}

}
