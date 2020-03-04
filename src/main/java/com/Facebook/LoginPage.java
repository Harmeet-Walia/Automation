package com.Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;

	@FindBy(name = "firstname")
	WebElement firstName;

	@FindBy(name = "birthday_month")
	WebElement BirthdayMonth;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}

	public void sendFirstName(String value) {
		firstName.sendKeys(value);

	}
	
	public void selectBirthdayMonth(String value) {
		Select select=new Select(BirthdayMonth);
		select.selectByValue(value);
	}

}