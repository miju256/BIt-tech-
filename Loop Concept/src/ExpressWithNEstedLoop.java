import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpressWithNEstedLoop {
 static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");

		driver = new FirefoxDriver();
		driver.get("https://www.express.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_3tHVp']")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[1]/a")).click();
JavascriptExecutor js =(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
int womenDivSize= driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/a")).size();
System.out.println(womenDivSize);
for(int i=1;i<=womenDivSize;i++) {
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div["+i+"]/div/div/div/a")).click();
	int imgSize=driver.findElements(By.xpath("//div[@class='_2CjJz']/div")).size();
for(int j=1;j<=imgSize; j++) {
	driver.findElement(By.xpath("//div[@class='_2CjJz']/div["+j+"]")).click();
driver.navigate().back();

}
driver.navigate().back();
}
	
	}

}
