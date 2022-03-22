package com.test.sanity;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SanityTest {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before sanity test");
	}

	@BeforeClass
	public void beforecalss() {
		System.out.println("before sanity class");
	}

	@BeforeMethod
	public void beforeeachetest() {
		System.out.println("before each sanity test ");
	}

	@Test
	public void testOne() {
		System.out.println("test  one ");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@AfterMethod
	public void afterMEthod() {
		System.out.println("after each sanity test");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after sanity class");
	}

}
