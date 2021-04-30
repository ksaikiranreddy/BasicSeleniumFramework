package com.application.pages.methods;

import com.application.pages.locators.PaymentPageLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;

public class PaymentPageMethods extends SeleniumActions implements PaymentPageLocators {
    WebDriver driver;

    public PaymentPageMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void click_GiftCard()
    {
        click(SELECT_GIFTCARD);
        driver.switchTo().frame(driver.findElement(GIFTCARD_IFRAME));
        System.out.println(driver.getTitle());

        click(ABOUT_TM);
        click(CLOSE_IFRAME);
        System.out.println(driver.getTitle());
    }
}
