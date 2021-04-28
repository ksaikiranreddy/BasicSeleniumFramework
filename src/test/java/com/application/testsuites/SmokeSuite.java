package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.dataproviders.SmokeSuiteData;
import com.application.pages.methods.HomePageMethods;
import com.application.pages.methods.LaunchPageMethods;
import com.application.pages.methods.ProductPageMethods;
import com.application.pages.methods.ViewCartItemsMethods;
import org.testng.annotations.Test;

public class SmokeSuite extends BrowserSetup {

    HomePageMethods homePageMethods;
    ProductPageMethods productPageMethods;
    ViewCartItemsMethods viewCartItemsMethods;

    @Test(enabled=false,dataProvider = "loginData", dataProviderClass = SmokeSuiteData.class)
    public void login(String userName, String password) {
        homePageMethods = new HomePageMethods(getDriver());
        homePageMethods.performLogin(userName, password);
        homePageMethods.verifyLogin();

    }

    @Test
    public void amazonAddItemToCart() throws InterruptedException {
        LaunchPageMethods launchPageMethods=new LaunchPageMethods(getDriver());
        launchPageMethods.launchURL();
        launchPageMethods.searchForProduct();

        productPageMethods=new ProductPageMethods(getDriver());
        String productName=productPageMethods.getFirstProductName();
        Thread.sleep(3000);
        productPageMethods.clickFirstProduct();
        productPageMethods.addToCart();
        productPageMethods.viewCartItems();

       viewCartItemsMethods=new ViewCartItemsMethods(getDriver());
       viewCartItemsMethods.verifyCartItems(productName);

    }

    //launch URL
    //search for shoes
    //click first item
    //click on add to cart
    //verify sucess message
    //verify item added to cart or not

}
