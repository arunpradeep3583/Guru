package org.qa.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.adactin.startup.StartUps;



public class Login extends StartUps {

	
	public Login(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (id = "username")
	private WebElement users;
	public Login userName(String data) {
		textboxField(users, data);
		return this;
		
	}
	@FindBy (id = "password")
	private WebElement pwd;
public Login passWord(String data) {
	textboxField(pwd, data);
	return this;
	
}

@FindBy (id="login")
private WebElement logButton;
public SearchHotel loginButton () {
	cliclActions(logButton);
	return new SearchHotel(driver);
	
}


		
}
