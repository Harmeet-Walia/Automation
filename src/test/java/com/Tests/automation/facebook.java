package com.Tests.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Facebook.LoginPage;
import com.practice.automation.basetest.driverConfig;

public class facebook extends driverConfig {
	
	

	@Test
	public void testLogin() {
		LoginPage login=new LoginPage(driver);
		login.sendFirstName("BePositive");
		login.selectBirthdayMonth("5");

	}

}
