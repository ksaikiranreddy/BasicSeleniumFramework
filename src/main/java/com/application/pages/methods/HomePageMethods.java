package com.application.pages.methods;

import com.application.pages.locators.HomePageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public class HomePageMethods extends SeleniumActions implements HomePageLocators {
    WebDriver driver;
    ReadProperties properties;

    public HomePageMethods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void navigateSpiceJet()
    {
        properties=new ReadProperties(configFilePath);
        navigateToURL(properties.getProperty("url"));
    }

    public void searchFlights()
    {

    }

}
