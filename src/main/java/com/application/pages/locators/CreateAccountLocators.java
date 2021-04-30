package com.application.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public interface CreateAccountLocators {

    By TITLE = By.xpath("//input[@id='ca-title::0']");
    By FIRSTNAME = By.xpath("//input[@id='ca-first-name::0']");
    By LASTNAME = By.xpath("//input[@id='ca-last-name::0']");
    By ADDRESS_STREET=By.xpath("//*[contains(@name,'::street')]");
    By ADDRESS_CITY = By.xpath("//*[@id='ca-city::0']");
    By ADDRESS_STATE = By.xpath("//*[contains(@id,'::state::select')]");
    By ADDRESS_COUNTRY = By.xpath("//*[contains(@id,'::country::select')]");
    By ADDRESS_ZIP=By.xpath("//*[@id='zip::0']");

    By EMAIL=By.xpath("//*[@id='user_email::0']");
    By PASSWORD=By.xpath("//*[@id='password::0']");
    By CONFIRM_PASSWORD=By.xpath("//*[@id='comp_password::0']");

    By COMMUNICATION_PREFERENCES=By.xpath("//*[contains(@id,'BOset::WScustomer::Customer::communication_preferences')]//input");

    By SELECT_ALL_INTERESTS=By.xpath("//button[@onclick='tsSetAllCheckboxes(\"BOset::WScustomer::Customer::keywords\")']");
    By MY_AGE=By.xpath("//*[@id='BOset::WScustomer::Marketing::data1::0']");
    By MARKETING_INTERESTS=By.xpath("//*[@id='BOset::WScustomer::Marketing::multidata1::0']");
    By CONTINUE_NEXT=By.xpath("//*[@value='Continue']");
    By CONTINUE2=By.xpath("//*[@id='continue']");



}
