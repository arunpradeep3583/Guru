package org.qa.adactin.startup;

import java.io.IOException;

import org.aq.basefunctions.GeneralMethods;
import org.qa.adactin.util.TestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class StartUps extends GeneralMethods {
	
	public String xlFile;
	
	@BeforeMethod
	@Parameters({"browser","url"})
		public void openBrowser(String browser, String url) {
		webBrowser(browser, url);
	
	}

	@DataProvider (name = "getData")
	public Object[][] readData() throws IOException{
		
		TestData obj = new TestData();
		return obj.readData(xlFile);
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		closeWebBrowser();
	}
	
}
