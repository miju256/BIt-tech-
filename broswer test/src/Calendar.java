import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria"
				+ "/Downloads/geckodriver");

		WebDriver driver = new FirefoxDriver(); 

		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 

		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://spicejet.com/");
		
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateVal = "10-05-2021";
		
		
		//selectDateByJS(driver, date, dateVal);
		
	}
	
	
//	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
//    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
//		
//	}
	
	
	
	
}
