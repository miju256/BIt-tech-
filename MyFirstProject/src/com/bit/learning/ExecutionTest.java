package com.bit.learning;

import org.openqa.selenium.By;

public class ExecutionTest {
	public static void main(String[] args) throws InterruptedException {

		TargetTest test = new TargetTest();

		test.targetTest();
		Scenario sc = new Scenario();

		sc.openBrowser();
		sc.getUrl("https://www.facebook.com/");
		sc.email(By.xpath("//input[@id='username']"), "miju915@gmail.com");
		sc.firstName(By.xpath("//input[@id='firstname']"), "yahia");
		sc.getCurrentUrl(
				"https://login.target.com/gsp/static/v1/login/?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_create_account");
		sc.lastName(By.xpath("//input[@id='lastname']"), "sayeed");

		sc.password(By.id("#password"), "miju256");
		sc.phone(By.id("#phone"), "2424724234");
		sc.createAccount(By.xpath("//button[text()='Create account']"));

		sc.quit();
	}
}
