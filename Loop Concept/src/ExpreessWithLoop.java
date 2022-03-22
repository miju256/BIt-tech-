import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ExpreessWithLoop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");

		driver = new FirefoxDriver();
		driver.get("https://www.express.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@class='_3tHVp']")).click();
		WebElement menButton = driver.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(menButton).build().perform();
		driver.findElement(By.xpath("//*[@id=\"root-Men\"]/ol/li[3]/ol/li[1]/a")).click();
		// driver.findElement(By.xpath("//a[@class='tile-href' and@aria-label='Mens
		// cozy']")).click();
		// WebElement menButton =
		// driver.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li[2]/a"));
		// listOfWebBylist(driver.findElements(By.xpath("//div[@class='DesktopHeader_desktopHeaderContainer__OghBQ']")));
		Thread.sleep(3000);
//	List<WebElement> newButton=driver.findElements(By.xpath("//div[@class='_2CjJz']/div/div/div/p"));
//	int size=newButton.size();
//	System.out.println(size);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_2CjJz']/div/div/div/p"));
		ExpreessWithLoop.listOfWebBylist(ele, "NEW");

	}

	public static void listOfWebBylist(List<WebElement> ele, String value) throws InterruptedException {

		int size = ele.size();
		System.out.println(size);

		for (int i = 1; 1 <= size; i++) {
			String text = ele.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(value))
				ele.get(i).click();
			//driver.navigate().back();

		}
	}

}
