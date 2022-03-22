package Repo;

import Browser.BrowserConfiguration;

public class ObjectRepository extends BrowserConfiguration {
	public static String expressLogo = "//div[@class='DesktopHeader_logo__25fvw']//a//img[@alt='Express' and@src='/content/dam/logos-fonts/logos/express/express-logo.svg']";
	public static String menButton = "//a[text()='Men']";
	public static String jeansPic = "//div[@class='grid__col-12']//div[@class='tilecomponent section']//a[@ class='tile-href'and @aria-label='Mens Shirts']";
	public static String firstJeans = "//img[@class='_1ddDj _136PD'and@alt='Slim Gray Temp Control Hyper Stretch Jeans']";
	public static String jeansColor = "//span[@class='_1e1-L']";
	public static String selectWaist = "//button[@type='button'and@class='_3OQxl'and@value='28'and@aria-label='Select 28 Waist']";
	public static String selectLength = "//button[@type='button' and@aria-label='Select 30 Length size']";
	public static String addToBagButton = "//button[text()='Add to Bag']";
	public static String clickCart = "";
	public static String quantity = "//select[@id='qdd-0-quantity']";
	public static String listofwebele="//ol[@class='MegaMenuSubcategory_links__1FVP5']//li[7]//a";
	
	public static String listOfEle="//ol[@class='MegaMenuSubcategory_links__1FVP5']/li[7]/a";
}
