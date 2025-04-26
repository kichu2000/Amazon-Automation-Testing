package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage {
    private WebDriver driver;
    By addToCartButton = By.xpath("//button[@id='a-autoid-1-announce']");
    By addToCartIcon = By.xpath("//span[@id='nav-cart-count']");

public ProductPage(WebDriver driver) {
	 this.driver=driver;
}


public void clickAddToCart() {
	driver.findElement(addToCartButton).click();
}

public void clickAddToCartIcon() {
	driver.findElement(addToCartIcon).click();
}

public void switchToNewTab() {
	for(String handle : driver.getWindowHandles()) {
		driver.switchTo().window(handle);
	}
	}

public boolean isProductAdded() {
	return  driver.getPageSource().contains("Added to Cart");
	
}

}