package testinng;





import org.openqa.selenium.By;


import com.bit.phone.MyIphone;
import com.bit.phone.MySamsung;

import Phone.GeneralPhone;

public class Smoketest extends GeneralPhone{

	

	public Smoketest(String phoneName, String phoneCarrier, boolean isGpsEnable, String phoneColor, int phoneNumber) {
		super(phoneName, phoneCarrier, isGpsEnable, phoneColor, phoneNumber);
		
	}

	public static void main(String[] args) {
		
		//MyIphone.iphoneSetting();
		openBrowser();
		goToAnywebsite("https://www.apple.com/");
		titleMatched("Apple");
		verifyElementPresent(dr.findElement(By.xpath("//a[@id='ac-gn-firstfocus']")));
		clickOnAnyElements(dr.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")));
		
		MyIphone o = new MyIphone(dr);
		o.clickon(By.xpath("//a[@href='/us/shop/goto/buy_iphone/iphone_se' and @ class='button']"));
		 
		MySamsung j= new MySamsung(dr);
	j.catchWebElements(dr.findElements(By.xpath("//ul[@class='ac-gn-list']")), 3);
	
	}

}
