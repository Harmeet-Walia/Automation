package com.mercuryTours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	
WebDriver driver;
	
	By firstName= By.name("firstName");
	By LastName=By.name("lastName");
	By submit=By.name("register");
	
	public Register(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void enterLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
	}
	
	public void clickOnSubmit() {
		driver.findElement(submit).click();
	}
	
	

}
