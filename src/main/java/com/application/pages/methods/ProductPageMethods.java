package com.application.pages.methods;

import com.application.pages.locators.ProductPageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Set;

public class ProductPageMethods extends SeleniumActions implements ProductPageLocators {

    WebDriver driver;

    public ProductPageMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public String getFirstProductName() {
        explicitWaitForSecs(3,PRODUCT_NAME);
        String productName=getText(PRODUCT_NAME);
        return productName;
    }

    public void clickFirstProduct() throws InterruptedException {
        String parent = driver.getWindowHandle();
        explicitWaitForSecs(5,PRODUCT);
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",driver.findElement(PRODUCT));

        click(PRODUCT);

        Thread.sleep(5000);
        Set<String> windows = driver.getWindowHandles();
        for(String window:windows)
        {
            driver.switchTo().window(window);
        }
    }

    public void addToCart() throws InterruptedException {
        explicitWaitForSecs(5,ADD_TO_CART);
        Thread.sleep(3000);
        click(ADD_TO_CART);
        Assert.assertEquals(getText(ADDED_TO_CART),"Added to Cart");
        System.out.println(driver.getTitle());
    }

    public void viewCartItems() throws InterruptedException {
        WebElement cartIcon= driver.findElement(CART_ICON);

        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",cartIcon);
        System.out.println(driver.getTitle());
    }
}
