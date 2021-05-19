package com.application.pages.locators;

import org.openqa.selenium.By;

public interface TravellerDetailsPageLocators {

    By FIRSTNAME= By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName']");
    By LASTNAME=By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName']");
    By PHONENUMBER=By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxHomePhone']");
    By EMAILADDRESS=By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress']");
    By CITY=By.xpath("//select[@name='contact_cities_list_india']");
    By IAMFLYING=By.xpath("//input[@id='CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_SJFlyingView_IamFlying']");
}
