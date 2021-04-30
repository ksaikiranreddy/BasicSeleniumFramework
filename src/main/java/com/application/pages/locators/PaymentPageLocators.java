package com.application.pages.locators;

import org.openqa.selenium.By;

public interface PaymentPageLocators {

    By SELECT_GIFTCARD= By.xpath("//*[@id='redeemCardButton']");
    By GIFTCARD_IFRAME=By.xpath("//*[@id='giftCard_iframe']");
    By ABOUT_TM=By.xpath("//*[contains(text(),'About Theatermania')]");
    By CLOSE_IFRAME=By.xpath("//*[@id='popupDiv_closeButton']");
}
