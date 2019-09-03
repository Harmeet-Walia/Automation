package com.mercuryTours.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	//By firstName= By.name("firstName");
	By LastName=By.name("lastName");
	By register=By.linkText("REGISTER");
	By support=By.linkText("SUPPORT");
	By contact=By.linkText("CONTACT");
	By yourDestination=By.linkText("your destination");
	By css = By.cssSelector("li");
	
	String name ="Harmeet";
	String lastname = "kaur";
	String fullname =name+" "+lastname;
	
	String sentence =  name+ " "+ lastname +  " is a good girl";
	String sent2= "Mrs "+ name + lastname + "walia";
	String tag = "li";
	String name1 = "Alan";
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void clickOnRegister() {
		driver.findElement(register).click();
	}
	
	public void enterFirstName(By firstName, String name) {
		driver.findElement(firstName).sendKeys(name);
	}
	
	public void enterLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
	}
	
	public void clickOnYourDestination() {
		driver.findElement(yourDestination).click();
	}
	public List<WebElement> my_function(String name, String tag){
	    return driver.findElements(By.cssSelector(tag+":contains('"+name+"')]"));
	}
	
	
}
