package StartTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Guru.Guru.ProjectMethods;

public class StartUp  extends ProjectMethods{
	
	
	
	
	
	@BeforeMethod
	@Parameters ({"browser", "url"})
	public void openWebBrowser(String browser, String url) throws IOException {
		openBrowsers(browser, url);
				
	}

	
	
	@AfterMethod
	public void closeWebBrowser() {
		closeBrowser();
		
	}
}
