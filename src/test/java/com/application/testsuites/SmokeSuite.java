package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.dataproviders.SmokeSuiteData;
import com.application.pages.methods.CreateAccountPageMethods;
import com.application.pages.methods.PaymentPageMethods;
import org.testng.annotations.Test;

public class SmokeSuite extends BrowserSetup {

    CreateAccountPageMethods createAccountPageMethods;
    PaymentPageMethods paymentPageMethods;

    @Test
    public void registrationGoldClub() throws InterruptedException {
        createAccountPageMethods = new CreateAccountPageMethods(getDriver());
        createAccountPageMethods.navigateToCreateAccount();
        createAccountPageMethods.enterDetails();
    }

    @Test
    public void paymentDetails()
    {
        paymentPageMethods=new PaymentPageMethods(getDriver());
        paymentPageMethods.click_GiftCard();

    }
}
