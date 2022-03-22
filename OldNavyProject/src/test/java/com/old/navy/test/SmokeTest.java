package com.old.navy.test;

import org.junit.Test;

import com.old.navy.pages.HomePage;

public class SmokeTest extends BaseTest{
	public static HomePage homepage;
@Test
public static void homePageTitleTest() {
	 HomePage homepage= new HomePage(driver);
	 homepage.titleTest();

}





}
