package testdataprovider;

import org.testng.annotations.Test;

import excelDtaprovider.BaseTest;

public class TestDataprovider {
	@Test(dataProvider = "exceldata", dataProviderClass = BaseTest.class)
	public void testDAta(String username, String password) {

		System.out.println(username + " | " + password);
	}
}
