package com.bit.amazon;

import org.openqa.selenium.By;

public class Shared {
	public void amazonTest() throws InterruptedException {
		Scenario sc =new Scenario();
		
		sc.openBrowser();
		sc.goToAnyWebsite("https://www.amazon.com/");
		sc.printTitle("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
		sc.typeOnAnyElements(By.xpath("//input[@id='twotabsearchtextbox']"), "kids shoes");
		Thread.sleep(5000);//kids shoes
		sc.clickOnAnyElemets(By.xpath("//input[@type='submit' and@ class='nav-input']"));//click search button
		Thread.sleep(3000);
		
		//go button
		sc.clickOnAnyElemets(By.xpath("//img[@src='https://m.media-amazon.com/images/I/91zk4dRil5L._AC_UL320_.jpg']"));//choose image
		sc.clickOnAnyElemets(By.xpath("//span[@id='dropdown_selected_size_name']//span[@class='a-button-inner']//span[@class='a-button-text a-declarative' and @role='button' and@data-action='a-dropdown-button']"));//size
		//sc.dropDownSelect(ele, value);//
		System.out.println("ccccc");
		Thread.sleep(3000);
		sc.clickOnAnyElemets(By.xpath("//div//img[@src='https://images-na.ssl-images-amazon.com/images/I/51aPtQ%2BTnJL._SS47_.jpg']"));//select color
		//sc.dropDownSelect(ele, value);
		Thread.sleep(3000);
		sc.clickOnAnyElemets(By.xpath("//input[@id='add-to-cart-button' and@ name='submit.add-to-cart']"));//add to cart
		sc.clickOnAnyElemets(By.xpath("//div//span[@id='nav-cart-count']"));
		sc.clickOnAnyElemets(By.xpath("//input[@name='proceedToRetailCheckout']"));
		sc.typeOnAnyElements(By.xpath("//input[@id='ap_email']"), "Miju915@gmail.com");
		
		
	
	}
	
	
	
	

	
	
}

