package com.mercuryTours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By firstName= By.name("firstName");
	By LastName=By.name("lastName");
	By register=By.linkText("REGISTER");
	By support=By.linkText("SUPPORT");
	By contact=By.linkText("CONTACT");
	By yourDestination=By.linkText("your destination");
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void clickOnRegister() {
		driver.findElement(register).click();
	}
	
	public void enterFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void enterLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
	}
	
	public void clickOnYourDestination() {
		driver.findElement(yourDestination).click();
	}
	
	
}
