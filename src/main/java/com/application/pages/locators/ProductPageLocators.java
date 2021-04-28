package com.application.pages.locators;

import org.openqa.selenium.By;

public interface ProductPageLocators {

    By PRODUCT=By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//a[@class='a-link-normal a-text-normal']");
    //By PRODUCT=By.xpath("//div[@data-cel-widget='search_result_2']");
    //By PRODUCT_NAME=By.xpath("//div[@data-cel-widget='search_result_2']//h5/span");
    By PRODUCT_NAME=By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//a[@class='a-link-normal a-text-normal']/span");
    //By SELECT_SIZE=By.xpath("native_dropdown_selected_size_name");
    By ADD_TO_CART=By.xpath("//*[@id='add-to-cart-button']");

    By ADDED_TO_CART=By.xpath("//*[contains(text(),'Added to Cart')]");
    By CART_ICON=By.xpath("//*[@class='nav-cart-icon nav-sprite']");
}
