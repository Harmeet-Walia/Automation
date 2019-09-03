/* Author Name-Harmeet
 * 
 * 
 * 
 */
package com.Tests.automation;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mercuryTours.Pages.LoginPage;
import com.mercuryTours.Pages.Register;
import com.mercuryTours.Pages.SignOnPage;
import com.practice.automation.basetest.driverConfig;

public class TestCase1 extends driverConfig {
	
		
	@Test(groups={"signUp"})
	public void signUp() {
		LoginPage login =new LoginPage(driver);
		Register register=new Register(driver);
		login.clickOnRegister();
		register.enterFirstName("Jorden");
		register.enterLastName("Mathews");
		register.clickOnSubmit();
		String title= driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours", "Test Passed");
		
		
		
		
		
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "Register: Mercury Tours");
//		driver.findElement(By.name("firstName")).sendKeys("Rose");
//		driver.findElement(By.name("lastName")).sendKeys("Max");
//
//		WebElement country = driver.findElement(By.name("country"));
//		Select countryDropDown = new Select(country);
//		List<WebElement> listOfCountry = countryDropDown.getOptions();
//
//		for (int i = 0; i < listOfCountry.size(); i++) {
//			System.out.println(listOfCountry.get(i).getText());
//		}
//
//		countryDropDown.selectByVisibleText("BRAZIL");
		//By.cssSelector(cssSelector)

	}
	
	@Test(groups= {"signUp"})
	public void signUpagain() {
		LoginPage login =new LoginPage(driver);
		Register register=new Register(driver);
		login.clickOnRegister();
		register.enterFirstName("Smarty");
		register.enterLastName("Kaur");
		register.clickOnSubmit();
		String title= driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours", "Test Passed");
	}
	
	@Test (groups= {"signOn"})
	public void signOn() {
	   SignOnPage signOnPage=new SignOnPage(driver);
	   signOnPage.clickOnSignOn();
	   signOnPage.enterUserName("Harmeet");
	   signOnPage.enterPassword("Harmeet");
	   signOnPage.clickOnSubmit();
	}
	
	@Test  (groups= {"login"}) 
	public void yourDestination() {
		LoginPage login=new LoginPage(driver);
		login.clickOnYourDestination();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Under Construction: Mercury Tours");
		System.out.println("The title is "+ title);
	}

}
