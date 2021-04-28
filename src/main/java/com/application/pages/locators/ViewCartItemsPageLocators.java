package com.application.pages.locators;

import com.application.pages.methods.ProductPageMethods;
import com.application.utilities.filehandlingutils.ReadProperties;
import org.openqa.selenium.By;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public interface ViewCartItemsPageLocators {

    //By CART_ITEMNAME=By.xpath("//span[@class='a-list-item']//span[@class='a-size-medium a-color-base sc-product-title']");
    By CART_ITEMNAME=By.xpath("//*[contains(@class,'sc-product-title')]");
}
