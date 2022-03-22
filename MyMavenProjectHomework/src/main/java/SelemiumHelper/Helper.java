package SelemiumHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {
	 static WebDriver driver;
	public static  Properties redPropertiesFile(String path) throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream(new File(path));
	Properties prop= new Properties ();
	prop.load(file);
	return prop;
	}
//	public static void actionclass(WebElement ele) {
//		Actions action = new Actions(driver);
//		action.moveToElement(ele).build().perform();
//	}
	
	public static void clickonAnyElement(WebElement ele) {
		ele.click();
	}
	public static void verify(WebElement ele) {
		ele.isDisplayed();
	}
	public void listofElement(List<WebElement> ele,int index) {
		ele.get(index).click();
	}
	
	

}
