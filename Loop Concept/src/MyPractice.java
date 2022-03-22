import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyPractice {
public  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");

		driver = new FirefoxDriver();
		driver.get("https://www.express.com/");
		driver .manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_3tHVp']")).click();//pop up
		WebElement menButton = driver.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li[2]/a"));
		menButton.click();
		Actions action = new Actions(driver);
		action.moveToElement(menButton).build().perform();
		//menButton.click();
		//Thread .sleep(3000);
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]"
				+ "/div[1]/div[1]/div[2]/nav[1]/ol[1]/li[2]/div[1]/ol[1]/li[3]/ol[1]/li[1]/a[1]"));
	//driver .findElement(By.xpath("//a[@aria-label='Mens Jeans']"));
		
	}
	public static void loop (WebElement ele ) {
		ele.getSize();
	}
	
	
	
	
	
	

}
