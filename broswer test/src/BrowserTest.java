import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mdgulamkibria"
				+ "/Downloads/chromedriver");
		driver= new ChromeDriver();
	driver.get("https://app.slack.com/"
			+ "client/THE8LNHH6/D01DYCKU7GS/user_profile/UHGL00V8C");
	
	
	}

}
