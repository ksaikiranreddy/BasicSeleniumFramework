package com.application.pages.methods;

import com.application.pages.locators.LaunchPageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public class LaunchPageMethods extends SeleniumActions implements LaunchPageLocators {

    WebDriver driver;
    ReadProperties properties;

    public LaunchPageMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void launchURL()
    {
        properties=new ReadProperties(configFilePath);
        String url=properties.getProperty("url");
        navigateToURL(url);
        Assert.assertEquals(url,driver.getCurrentUrl());
    }

    public void searchForProduct()
    {
        enterText(SEARCH_TEXT,properties.getProperty("itemtype"));
        click(SEARCH_BTN);
    }
}
