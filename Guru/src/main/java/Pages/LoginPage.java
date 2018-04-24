package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StartTesting.StartUp;

public class LoginPage extends StartUp {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	@FindBy(name = "uid")
	private WebElement user;
	public LoginPage user(String data) {
		
		texBox(user, data);
		return this;
		
	}
	
	@FindBy (name = "password")
	private WebElement password;
	public LoginPage password(String data) {
		texBox(password, data);
		return this;
		
	}
	
	@FindBy(name = "btnLogin")
	private WebElement loginButton;
	public DashBoard loginButton() {
		clickAction(loginButton);
		return new DashBoard(driver);
		
	}
	

}
