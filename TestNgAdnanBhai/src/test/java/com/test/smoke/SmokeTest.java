package com.test.smoke;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmokeTest {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void beforecalss() {
		System.out.println("before smoktest class");
	}
	@BeforeMethod
	public void beforeeachetest() {
		System.out.println("before each test ");
	}
	@Test(groups="Smoketest1")
	public void testOne() {
		System.out.println("test one ");
	}
	
	@Test(groups="Smoketest2")
	public void test2() {
		System.out.println("Test 2");
	}
	@AfterMethod
	public void afterMEthod() {
		System.out.println("after each test");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after smoketest class");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
