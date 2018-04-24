package Guru.Guru;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ProjectMethods {
	
	public WebDriver driver;
	
	public void openBrowsers(String browser, String url) {
		
		switch(browser) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		break;
		case "ie":
			System.setProperty("webdriver.ie.driver",  "./drivers/chromedriver.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public WebElement findLocators(String locator, String locatorValue) {
		WebElement element = null;
		switch(locator) {
		case "id": element = driver.findElement(By.id(locatorValue));
		break;
		case "name": element = driver.findElement(By.name(locatorValue));
		break;
		case "class": element = driver.findElement(By.className(locatorValue));
		break;
		case "tag": element = driver.findElement(By.tagName(locatorValue));
		break;
		case "link": element = driver.findElement(By.linkText(locatorValue));
		break;
		case "partialLink": element = driver.findElement(By.partialLinkText(locatorValue));
		break;
		case "xpath": element = driver.findElement(By.xpath(locatorValue));
		break;
		}
		return element;
		
	}
	
	public void texBox(WebElement element, String data) {
		
		element.clear();
		element.sendKeys(data);
		
	}
	
	public void clickAction(WebElement element) {
		element.click();
	}
	

	public void closeBrowser() {
		driver.quit();
	}
	
	public void getText(WebElement element, String data) {
		
		String textData = element.getText();
		if (textData.equalsIgnoreCase(data)) {
			System.out.println("Verified");
		}else {
			System.out.println("Incorrect Text");
		}
		
	}
	
	public void table(WebElement element, String data) {
		
		List<WebElement> tr = element.findElements(By.tagName("tr"));
		for (int i=0;i<=tr.size();i++) {
			List<WebElement> td= tr.get(i).findElements(By.tagName("td"));
			for (int j=0;j<=td.size();j++) {
				
				String value = td.get(j).getText();
				if (value.equalsIgnoreCase(data)) {
					System.out.println(value);
				}
				
			}
		}
			
		
		
	}
	
	
	
	
}
