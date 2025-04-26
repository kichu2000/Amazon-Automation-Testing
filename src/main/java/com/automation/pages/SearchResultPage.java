package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
	
	 WebDriver driver;
	 By productTile = By.cssSelector("span.a-size-medium.a-text-normal");
     
	 public SearchResultPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickFirstProduct() {
		driver.findElement(productTile).click();
	}

}
