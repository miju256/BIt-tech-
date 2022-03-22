package ReturnMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReturnClass {
 int a =100;
 
 
	public static void main(String[] args) {
	int r = abc2(10,20);
	 String s =pqr();
	 System.out.println(s);

	 System.out.println(r);
	
	  boolean v=typeBoolean();
	  System.out.println(v);
	  float w =floatType();
	 System.out.println(w);
	  boolean m=xyz ();
	  System.out.println(m);
	 
	   
	 
	
	}
	
	public int abc() {
		return a;
	}
	public static int abc2(int x,int y) {
		int r =x+y;
		return r;
	}
	
	public static String  pqr() {
		String s= "I love java ";
		return s;
	}
	
	public WebDriver anyDriver() {
		return new FirefoxDriver();
	}
	
	
	public static ReturnClass returnClass() {
		return new ReturnClass();
		
	}
	public char character() {
		char x='a';
		char n= 'b';
		char c =(char) (x+n);
		 return c;
	}
	public static boolean typeBoolean() {
		int x=10;
		int y=12;
		if(x>y) {
			System.out.println("x is small");
		}
		else {
			System.out.println("x is large");
		}
		return false ;
		
	}
	public static boolean xyz () {
		int x= 10;
		int y=2;
		boolean z=x<y; 
		return z;
	}
	public static float floatType() {
		float f= 124434;
		float v=1313131;
		float w=f+v;
		return w;
		}
		
	
	
	public static String czk() {
		return pqr();
	}
	 public void vhu() {
		 pqr();
	 }
		
	}
	
	


