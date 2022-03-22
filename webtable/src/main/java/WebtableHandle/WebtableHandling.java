package WebtableHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtableHandling {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/mdgulamkibria/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//How to find number of row from a table?

		int rows =driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		System.out.println("total num of rows "+rows);
		//How to find column in a table ?
		int cols= driver.findElements(By.xpath("//table[@class='data-list']//thead/tr/th")).size();
			System.out.println("totla number of column in table is "+cols);
		
	}

}
