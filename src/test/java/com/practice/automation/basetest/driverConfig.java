package com.practice.automation.basetest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class driverConfig {

	 protected WebDriver driver = null;

	@BeforeTest (alwaysRun = true)
	public void initaiteDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\walia\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest(alwaysRun = true)
	public void closeDriver() {
		driver.quit();
	}

}
