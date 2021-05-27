package com.application.basesetup;

import com.application.utilities.seleniumutils.SingletonClass;
import com.application.utilities.filehandlingutils.ReadProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserSetup {

    private static WebDriver driver;
    ReadProperties properties;
    Logger logger = LogManager.getLogger("BrowserSetup");

    public static WebDriver getDriver() {

        return driver;
    }

    SingletonClass instance;

    @BeforeTest
    public WebDriver initiateBrowser() {
        driver=instance.browserIntialization();
        return driver;
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
        logger.info("**********************Browser Closed*********************************");
    }
}
