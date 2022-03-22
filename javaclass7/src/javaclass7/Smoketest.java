package javaclass7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Smoketest extends Basetest {

	
		
	public Smoketest(FirefoxDriver dr) {
		super(dr);
		
	}


	
	

	public static void main(String[] args) {
		
		Basetest a= new Basetest(10, "black");
		Basetest t =new Basetest(carWheel, "white", "toyota");
		//Basetest x =new Basetest(dr);
		a.openBrowser();
		
		//o.openBrowse(dr);
		dr.get("https://www.facebook.com/");
		Scenario o= new Scenario();
		o.typeOnAnyElements();
	
	
	
	//o.openBrowse(dr);
	//o.typeOnAnyElements();
	
	
	
	}
	
}
