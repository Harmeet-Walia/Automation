package com.Tests.automation;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	WebDriver driver = null;

//	@BeforeTest
//	public void beforeMethod() {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\walia\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://automationpractice.com/index.php");
//		driver.manage().window().maximize();
//	}

	@Test
	public void Test1() {
		driver.findElement(By.name("search_query")).sendKeys("dresses");
		driver.findElement(By.name("submit_search")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Search - My Store");
		System.out.println("The title is matching");
	}
	
	@Test
	public void Test2() {
		
		driver.findElement(By.xpath("//a[contains(@title, 'View my shopping cart')]")).click(); 
		String title=driver.getTitle();
		Assert.assertEquals(title, "Order - My Store");
		System.out.println("Test case passed..Hurray!!");
		
		
	}
	
	@AfterTest
	public void teardown() {
		//driver.quit();
	}

}
