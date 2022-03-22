package Phone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeneralPhone {
	public static FirefoxDriver dr;
	String phoneName;
	String phoneCarrier;
	boolean isGpsEnable;
	String phoneColor;
	int phoneNumber;
	
public 	GeneralPhone(FirefoxDriver dr){
		this.dr = dr;
	}
	
	
	public GeneralPhone(String phoneName, String phoneCarrier,boolean isGpsEnable,String phoneColor, int phoneNumber){
		this.phoneNumber= phoneNumber;
		this.phoneCarrier = phoneCarrier;
		this.isGpsEnable=isGpsEnable;
		this.phoneColor =phoneColor;
		this.phoneNumber= phoneNumber;
		
	
	}
	
	
	
	
	
	
	
	
	public static void openBrowser() {
		if(dr==null);
		dr= new FirefoxDriver();
		
		
		}
	
	public static void goToAnywebsite(String url) {
		dr.get(url);
		System.out.println("My url is"+url);
	}
	
	public String checkCurrentUrl() {
		String i=dr.getCurrentUrl();
		System.out.println("My current url is"+i );
		return i; 
	}
	
	public void typeOnAnyElements (By locator, String value ) {
		dr.findElement(locator).sendKeys(value);
	}
	public static void clickOnAnyElements (WebElement ele) {
		ele.click();
		System.out.println("clicking is complete");
	}
	
	public static boolean verifyElementPresent(WebElement ele ) {
		 boolean o =ele.isDisplayed();
		 System.out.println("Element is present in the webpage");
		 return o;

	}
	public static String titleMatched(String expectedtitle) {
		String myTitle= dr.getTitle();
		myTitle.equals("expectedtitle");
		System.out.println("Title Matched"+expectedtitle);
		return myTitle;
	}
	
	
	
	
	
	
	
	
	
	

}
