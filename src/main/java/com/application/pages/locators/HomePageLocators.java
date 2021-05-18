package com.application.pages.locators;

import com.application.utilities.filehandlingutils.ReadProperties;
import org.openqa.selenium.By;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public interface HomePageLocators {

    ReadProperties properties=new ReadProperties(configFilePath);

String departCity=properties.getProperty("departcity");
String arrivalCity=properties.getProperty("arrivalcity");

By ONEWAY=By.xpath("//input[@value='OneWay' and @id='ctl00_mainContent_rbtnl_Trip_0']");
By DEPARTURECLICK=By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
By DEPARTURE_CITY=By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='"+departCity+"']");
By ARRIVALCLICK=By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");
By ARRIVAL_CITY=By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='"+arrivalCity+"']");

By DEPART_DATE=By.xpath("//input[@id='ctl00_mainContent_view_date1']");
By PASSENGERS_COUNT=By.xpath("//div[contains(text(),'1 Adult')]");
By SEARCH=By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");


}
