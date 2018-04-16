package org.qa.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.adactin.startup.StartUps;

public class SearchHotel extends StartUps {
	
public SearchHotel(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


@FindBy (id = "location")
private WebElement loct;
public SearchHotel location(String data) {
	dropdownSelection(loct, data);
	return this;
}







}
