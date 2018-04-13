package org.qa.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.adactin.startup.StartUp;

public class Login extends StartUp {

	
	public Login(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "username")
	private WebElement users;
	public Login userName(String user) {
		textboxField(users, user);
		return this;
		
	}
	
	
}
