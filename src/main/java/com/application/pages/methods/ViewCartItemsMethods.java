package com.application.pages.methods;

import com.application.pages.locators.ViewCartItemsPageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ViewCartItemsMethods extends SeleniumActions implements ViewCartItemsPageLocators {

    WebDriver driver;
    ReadProperties properties;

    public ViewCartItemsMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void verifyCartItems(String productName) throws InterruptedException {

        Thread.sleep(5000);
        explicitWaitForSecs(5,CART_ITEMNAME);
        String actualCartItem=getText(CART_ITEMNAME);
        System.out.println(actualCartItem+" ... "+productName);
        Assert.assertTrue(actualCartItem.contains(productName), "matched");
    }
}
