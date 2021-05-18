package com.application.pages.methods;

import com.application.pages.locators.HomePageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.jws.Oneway;

import java.util.List;

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

    public void oneWaySelect()
    {
        explicitWaitForSecs(3,ONEWAY);
        boolean selectOneWay=driver.findElement(ONEWAY).isSelected();
        Assert.assertTrue(selectOneWay,"One way is selected");
        System.out.println("one way");
    }

    public void departAndArrival() throws InterruptedException {

        //select departure city
        explicitWaitForSecs(4,DEPARTURECLICK);
        click(DEPARTURECLICK);
        System.out.println(getText(DEPARTURE_CITY));
        click(DEPARTURE_CITY);

        //select arrival city
        explicitWaitForSecs(4,ARRIVALCLICK);
        click(ARRIVALCLICK);
        System.out.println(getText(ARRIVAL_CITY));
        click(ARRIVAL_CITY);
    }


}
