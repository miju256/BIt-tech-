package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
  FirefoxDriver dr;
	
 public void openBrowser  () {
	 System.setProperty("webdriver.gecko.driver","/Users/mdgulamkibria/Downloads/geckodriver");
	 
	 dr= new FirefoxDriver ();
	 }
 public void getUrl() {
	 dr.get("https://www.bestbuy.com/");
 }
 public void clickOnAccount() {
	 dr.findElement(By.xpath("//span[text()='Account']")).click();
 }
 public void clickOnCreateAccount() {
	 dr.findElement(By.xpath("//button[text()='Create Account']")).click();
 }
 public void typeInFirstName() {
	 dr.findElement(By.xpath("//input[@id='firstName']")).sendKeys("miju");
 }
 public void typeInLastName() {
	 dr.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sayeed");
 }
 public void typeOnEmail() {
	 dr.findElement(By.xpath("//input[@id='email']")).sendKeys("miju915@gmail.com");
 }
 public void typeOnPassword() {
	 dr.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys("miju256");
 }
 public void typeOnPhoneNumber() {
	 dr.findElement(By.xpath("//input[@id='phone']")).sendKeys("323234424");
 }
 public void checkBoxphone() {
	 dr.findElement(By.xpath("//div//input[@id='is-recovery-phone']")).click();
 }
 public void pessCreateAccount() {
	 dr.findElement(By.xpath("//button[contains(text(),'Create an Account')]")).click();
 }
 public void closebrowser() {
	 dr.quit();
 }
 
 
 
 
 
	
	
	
	
	
}
