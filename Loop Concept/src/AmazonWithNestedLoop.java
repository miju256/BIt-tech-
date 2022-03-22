import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonWithNestedLoop {
	static WebDriver driver ;
	
	public static void main(String[] args) {
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver .get("https://www.amazon.com/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 List<WebElement>topBar= driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
			int size=topBar.size();
System.out.println(size);
for(int i=1;i<=size;i++) {
	String p=driver.findElements(By.xpath("//div[@id='nav-xshop']/a")).get(i).getText();
	System.out.println(p);
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a["+i+"]")).click();
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,300)");
	//List<WebElement> picSize =driver.findElements(By.xpath("//div[@class='a-section tiles']/div"));  //working 
	List<WebElement> picSize =driver.findElements(By.xpath("//div[@id='widgetContent']/div"));
	int imgsize=picSize.size();
System.out.println(imgsize);

for(int j=1;j<=imgsize;j++) {
	//driver.findElement(By.xpath("//div[@class='a-section tiles']/div["+j+"]")).click(); //working 
	driver.findElement(By.xpath("//div[@id='widgetContent']/div["+j+"]")).click();//get stuck
	driver.navigate().back();
}
driver.navigate().back();

}

	}

}
