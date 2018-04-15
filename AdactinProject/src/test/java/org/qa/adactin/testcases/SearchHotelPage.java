package org.qa.adactin.testcases;

import org.qa.adactin.pages.Login;
import org.qa.adactin.startup.StartUp;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.SearchHotel;

public class SearchHotelPage extends StartUp {
	
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
