package seleniumCalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarConcepts {
static WebDriver driver;

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	WebElement dataPicker=driver.findElement(By.id("ctl00$mainContent$txt_Fromdate"));
String dateVal="Sat, Jan 31 2021";
	calendarwithJs(dataPicker, driver,dateVal );
}
public static void calendarwithJs(WebElement element,WebDriver driver,String dateValue ) {
	

	 JavascriptExecutor js =((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute)'value','"+dateValue+"');", element);


}







}
