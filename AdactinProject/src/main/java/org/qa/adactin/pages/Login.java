package org.qa.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.adactin.testcases.SearchHotelPage;

import utils.StartUp;



public class Login extends StartUp {

	
	public Login(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "username")
	private WebElement users;
	public Login userName(String data) {
		textBoxField(users, data);
		return this;
		
	}
	@FindBy (id = "password")
	private WebElement pwd;
public Login passWord(String data) {
	textBoxField(pwd, data);
	return this;
	
}

@FindBy (id="login")
private WebElement logButton;
public SearchHotel loginButton () {
	clickActions(logButton);
	return new SearchHotel(driver);
	
}


		
}
