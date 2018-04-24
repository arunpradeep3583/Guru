package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StartTesting.StartUp;

public class DashBoard extends StartUp {
	
	public DashBoard (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (linkText = "Manger Id : mngr128517")
	private WebElement managerId;
	public DashBoard VerifyManager(String data) {
		
		table(managerId, data);	
		return this;
		
	}
	
	
	
	@FindBy(linkText="New Customer")
	private WebElement newCust;
	public DashBoard newCustomer() {
		clickAction(newCust);
		return this;
	}

}
