package Guru.Guru;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import StartTesting.StartUp;

public class DashBoardTest extends StartUp{
	
	public Properties prop;
	String propFile = "F:\\Pradeep_Selenium\\NewWorkspace\\Guru\\src\\main\\java\\utils\\User.properties";
	
	@BeforeTest
	public void data() {
		
	}
	
	@Test
	public void dashboardTest() throws IOException {
		
		prop = new Properties();
		FileInputStream path = new FileInputStream (propFile);
		prop.load(path);
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		new LoginPage(driver)
		.user(user)
		.password(pass)
		.loginButton()
		.newCustomer();
		
		
		
		
		
	}

}
