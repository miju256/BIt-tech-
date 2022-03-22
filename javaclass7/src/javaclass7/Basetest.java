package javaclass7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest {
 public static int carYear;
 static String  carName;
 String carColor;
   static int carWheel;
    static FirefoxDriver dr;
 
  public Basetest(FirefoxDriver dr) {
	  Basetest.dr=dr;
	  dr.get("http://www.facebook.com/");
	  
  }
 
  public Basetest(int carWheel,String carName ) {
	   Basetest.carWheel=carWheel;
	   Basetest .carName= carName;
	   System.out.println("the number of my car wheel is "+ carWheel+"\n My car's brand name is "+carName);
  }
  public Basetest(String carColor,int carWheel) {
	  this.carColor=carColor;
	  Basetest.carWheel=carWheel;
	  System.out.println("My car's color is: "+carColor+" \n My car's wheel number is:"+carWheel);
  }
   public Basetest(int carYear, String carColor,String carName) {
	   Basetest.carYear=carYear;
	   this.carColor=carColor;
	   Basetest.carName=carName;
	   System.out.println("My car's year is "+carYear+"\n My cars color is"+carColor+"\n My car's name is "+carName);
			   
   } 
   public void openBrowser() {
	   dr= new FirefoxDriver();
   }
   public  static void car() {
	   System.out.println(carYear);
	   
	   
   }
 
}
