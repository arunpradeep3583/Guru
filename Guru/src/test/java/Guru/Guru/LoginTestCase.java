package Guru.Guru;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import StartTesting.StartUp;

public class LoginTestCase extends StartUp {

	public Properties prop;
	String propFile = "F:\\Pradeep_Selenium\\NewWorkspace\\Guru\\src\\main\\java\\utils\\User.properties";
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		prop = new Properties();
		FileInputStream path = new FileInputStream (propFile);
		prop.load(path);
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		new LoginPage(driver)
		.user(user)
		.password(pass)
		.loginButton();
		
		
		
		
		
	}
	
	

}
