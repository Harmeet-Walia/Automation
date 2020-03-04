package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOnPage {

	WebDriver driver;

	By signOn = By.linkText("SIGN-ON");
	By userName = By.name("userName");
	By password = By.name("password");
	By login= By.name("login");

	public SignOnPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSignOn() {
		driver.findElement(signOn).click();
	}

	public void enterUserName(String UserName) {
		driver.findElement(userName).sendKeys(UserName);
		;
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnSubmit() {
		driver.findElement(login).click();
	}

}
