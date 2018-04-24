package org.qa.adactin.testcases;

import org.qa.adactin.pages.Login;
import org.qa.adactin.startup.StartUps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchHotelPage extends StartUps {
	
	@BeforeClass
	public void testData() {
		xlFile = "./TestData/SearchHotel.xlsx";
		
	}
	
	@Test (dataProvider="getData")
	public void hotelSearch(String sno, String user, String password, String location) {
		
		new Login(driver)
		.userName(user)
		.passWord(password)
		.loginButton()
		.location(location);
		
		
		
		
		
	}

}
