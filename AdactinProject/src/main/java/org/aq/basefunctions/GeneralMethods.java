package org.aq.basefunctions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GeneralMethods {
	
	public RemoteWebDriver driver;
	
	public void webBrowser(String browser, String url) {
		
		switch(browser) {
		case"chrome": System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		case"ie": System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		break;
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	
	public WebElement findLocators(String locator, String locatorValue) {
		
		WebElement element = null;
		
		switch(locator) {
		
		case"id": element = driver.findElement(By.id(locatorValue));
		break;
		case"name": element = driver.findElement(By.name(locatorValue));
		break;
		case"class": element = driver.findElement(By.className(locatorValue));
		break;
		case"tag": element = driver.findElement(By.tagName(locatorValue));
		break;
		case"link": element = driver.findElement(By.linkText(locatorValue));
		break;
		case"partial": element = driver.findElement(By.partialLinkText(locatorValue));
		break;
		case"xpath": element = driver.findElement(By.xpath(locatorValue));
		break;
		}
		
		return element;
		
	}
	
public void textboxField(WebElement element, String data) {
	element.click();
	element.sendKeys(data);
}

public void getText(WebElement element, String data) {
	String textValue = element.getText();
	Assert.assertEquals(textValue, data);
	
}

public void getAttribute(WebElement element, String data) {
	String attributeValue = element.getAttribute(data);
	Assert.assertEquals(attributeValue, data);
}

public void dropdownSelection(WebElement element, String data) {
	
	Select option = new Select(element);
	List<WebElement> alloptions = option.getOptions();
	for (WebElement eachOption : alloptions) {
		String value = eachOption.getText();
		
		if (value.equalsIgnoreCase(data))
			eachOption.click();
		}
	
	//option.deselectByVisibleText(data);
	
}




public void tableSelection(WebElement element, String data) {
	
List<WebElement> tr = element.findElements(By.tagName("tr"));
for (int i=0;i<=tr.size();i++) {
	List<WebElement>td = tr.get(i).findElements(By.tagName("td"));
	for (int j=0;j<=td.size();j++) {
		
		if (td.get(j).getText().equalsIgnoreCase(data)) {
		td.get(j).click();
		}
	}
}
	
}

public void dragAndDrop(String locatorValue) {
	
	
	WebElement fromValue = driver.findElement(By.id(locatorValue));
	WebElement toValue = driver.findElement(By.name(locatorValue));
	Actions dargDrop = new Actions(driver); 
	dargDrop.dragAndDrop(fromValue, toValue).build().perform();

}


public void getTitle(String data) {
	String titleValue = driver.getTitle();
	Assert.assertEquals(titleValue, data);
	
}

public void cliclActions(WebElement element) {
	element.click();
	
}
public void switchTOFrame(String data) {
	driver.switchTo().frame(data);
}

public void alertAccept() {
	driver.switchTo().alert().accept();
}

public void alertDismiss() {
	driver.switchTo().alert().dismiss();
}

public void switchToDefaultContent() {
	driver.switchTo().defaultContent();
}


public void switchToWindow() {
	
	String parentWindow = driver.getWindowHandle();
	Set<String> childWindow= driver.getWindowHandles();
	
	for (String allWindow : childWindow) {
		
		if (allWindow!=parentWindow) {
			driver.switchTo().window(allWindow);
		}
	}
	
}

}