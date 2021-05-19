package com.application.pages.methods;

import com.application.pages.locators.TravellerDetailsPageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public class TravellerDetailsPageMethods extends SeleniumActions implements TravellerDetailsPageLocators {

    WebDriver driver;
    ReadProperties properties=new ReadProperties(configFilePath);

    public TravellerDetailsPageMethods(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public void fillPassengerDetails() throws InterruptedException {

        enterText(FIRSTNAME,properties.getProperty("firstname"));
        enterText(LASTNAME,properties.getProperty("lastname"));
        enterText(PHONENUMBER,properties.getProperty("phone"));
        enterText(EMAILADDRESS,properties.getProperty("email"));

        Select city=new Select(driver.findElement(CITY));
        city.selectByVisibleText(properties.getProperty("city"));

        click(IAMFLYING);
        Thread.sleep(3000);
    }
}
