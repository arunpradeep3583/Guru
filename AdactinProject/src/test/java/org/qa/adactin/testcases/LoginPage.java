package org.qa.adactin.testcases;

import org.qa.adactin.pages.Login;
import org.qa.adactin.startup.StartUps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage extends StartUps {
	
	
	@BeforeClass
	public void dataInfo() {
		
		xlFile = "./Testdata/Adactin.xlsx";
	}
	
	
	@Test (dataProvider = "getData")
	
	public void LoginPageTest(String Sno, String user, String password) {
		
	new Login(driver)
	.userName(user)
	.passWord(password)
	.loginButton();
	
		
	}
	

}
