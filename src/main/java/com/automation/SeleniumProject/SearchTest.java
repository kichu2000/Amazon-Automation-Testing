package com.automation.SeleniumProject;

import org.testng.annotations.Test;
import com.automation.pages.HomePage;
import com.aventstack.extentreports.Status;

public class SearchTest extends BaseTest {
	@Test
    public void searchItem() {
		test = extent.createTest("Search Item Test"); // Create Extent Report test

        HomePage home = new HomePage(driver);
        test.log(Status.INFO, "Navigated to Home Page");

        home.searchProduct("Laptop");
        test.log(Status.INFO, "Searched for 'Laptop'");

        System.out.println("Search Test Passed!");
        test.log(Status.PASS, "Search Test Passed!");
    }

}
