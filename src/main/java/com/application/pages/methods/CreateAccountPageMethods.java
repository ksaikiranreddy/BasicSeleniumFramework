package com.application.pages.methods;

import com.application.pages.locators.CreateAccountLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public class CreateAccountPageMethods extends SeleniumActions implements CreateAccountLocators {
    WebDriver driver;
    ReadProperties properties;

    public CreateAccountPageMethods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void navigateToCreateAccount()
    {
        properties=new ReadProperties(configFilePath);
        navigateToURL(properties.getProperty("url"));
        System.out.println(driver.getTitle());
    }

    public void enterDetails() throws InterruptedException {

        JavascriptExecutor js=(JavascriptExecutor) driver;

        enterText(TITLE,"MR.");
        enterText(FIRSTNAME,"James");
        enterText(LASTNAME,"cameroon");

        //WebElement element= driver.findElement(ADDRESS_STREET);
        //js.executeScript("document.getElementsByName('BOset::WScustomer::Addresses::1D48542C-25B3-40A3-8D25-4BA5DF4575AC::street').value='street'");

        enterText(ADDRESS_STREET,"35th mount");

        enterText(ADDRESS_CITY,"hamington");
        //select state

        Select stateOptions=new Select(driver.findElement(ADDRESS_STATE));
        stateOptions.selectByVisibleText("CA");

       Select countryOptions=new Select(driver.findElement(ADDRESS_COUNTRY));
       countryOptions.selectByVisibleText("USA");

        //js.executeScript("document.getElementsByName('BOset::WScustomer::Addresses::EB1209AA-2BBF-4424-8E7C-D39BA926CC66::country').selectedIndex='2'");

        enterText(ADDRESS_ZIP,"90231");

        enterText(EMAIL,"henry@gmail.com");
        enterText(PASSWORD,"Second@123");
        enterText(CONFIRM_PASSWORD,"Second@123");

        List<WebElement> comm_pref=driver.findElements(COMMUNICATION_PREFERENCES);
        for(WebElement pref:comm_pref)
        {
            pref.click();
        }

        //select all button click
        click(SELECT_ALL_INTERESTS);

        Select marketingOptions=new Select(driver.findElement(MY_AGE));
        marketingOptions.selectByIndex(2);

        Select marketingInterests=new Select(driver.findElement(MARKETING_INTERESTS));
        marketingInterests.selectByVisibleText("Hotels");


        click(CONTINUE_NEXT);

        Thread.sleep(4000);
        //click continue once again
        click(CONTINUE2);



    }





}
