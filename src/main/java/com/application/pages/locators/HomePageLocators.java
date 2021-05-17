package com.application.pages.locators;

import org.openqa.selenium.By;

public interface HomePageLocators {

By ONEWAY=By.xpath("//input[@value='OneWay' and @id='ctl00_mainContent_rbtnl_Trip_0']");
By DEPARTURE_CITY=By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']");
By ARRIVAL_CITY=By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1']");
By DEPART_DATE=By.xpath("//input[@id='ctl00_mainContent_view_date1']");
By PASSENGERS_COUNT=By.xpath("//div[contains(text(),'1 Adult')]");
By SEARCH=By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");


    String LOGIN_VERIFICATION_TEXT = "Test";
}
