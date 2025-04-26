package com.automation.SeleniumProject;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCartWithOutLogin() {
        test = extent.createTest("Add Product to Cart Without Login");

        try {
            test.info("Launching HomePage");
            HomePage home = new HomePage(driver);

            test.info("Searching for 'Laptop'");
            home.searchProduct("Laptop");

            ProductPage product = new ProductPage(driver);

            test.info("Clicking 'Add to Cart' button");
            product.clickAddToCart();

            test.info("Clicking cart icon to view cart");
            product.clickAddToCartIcon();

            test.info("Switching to new tab");
            product.switchToNewTab();

            boolean isAdded = product.isProductAdded();
            Assert.assertTrue(isAdded);
            test.pass("Product added to cart successfully ✔");

        } catch (Exception e) {
            test.fail("Test failed ❌: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("Test encountered an exception: " + e.getMessage());
        }
    }
}
