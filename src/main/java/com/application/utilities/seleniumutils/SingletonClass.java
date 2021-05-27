package com.application.utilities.seleniumutils;

import com.application.pages.methods.HomePageMethods;
import com.application.pages.methods.SelectFlightPageMethods;
import com.application.pages.methods.TravellerDetailsPageMethods;
import com.application.utilities.filehandlingutils.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.application.basesetup.BrowserSetup.getDriver;
import static com.application.utilities.commons.CommonVariables.configFilePath;

public class SingletonClass {

    private static WebDriver driver;
    private static ReadProperties properties;
    private static Logger logger = LogManager.getLogger("BrowserSetup");
    private static HomePageMethods homePageMethods;
    private static SelectFlightPageMethods selectFlightPageMethods;
    private static TravellerDetailsPageMethods travellerDetailsPageMethods;

    private SingletonClass()
    {
        System.out.println("object created");
    }

    public static WebDriver browserIntialization()
    {
        properties = new ReadProperties(configFilePath);
        String browser = properties.getProperty("browser");
        logger.info("**************************Test will be run on " + browser + "**************************");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
        }
        driver.manage().window().maximize();
        logger.info("*************************Browser Launched******************************");
        return driver;
    }

    public static HomePageMethods getInstanceHomePage()
    {
        if (homePageMethods==null)
            homePageMethods=new HomePageMethods(getDriver());
        return homePageMethods;
    }

    public static SelectFlightPageMethods getInstanceSelectFlightPage()
    {
        if(selectFlightPageMethods==null)
            selectFlightPageMethods=new SelectFlightPageMethods(getDriver());
        return selectFlightPageMethods;
    }

    public static TravellerDetailsPageMethods getInstanceTravellerDetailsPage()
    {
        if(travellerDetailsPageMethods==null)
            travellerDetailsPageMethods=new TravellerDetailsPageMethods(getDriver());
        return travellerDetailsPageMethods;
    }


}
