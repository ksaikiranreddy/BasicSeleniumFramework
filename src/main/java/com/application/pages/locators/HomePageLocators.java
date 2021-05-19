package com.application.pages.locators;

import com.application.utilities.filehandlingutils.ReadProperties;
import org.openqa.selenium.By;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public interface HomePageLocators {

    ReadProperties properties=new ReadProperties(configFilePath);

String departCity=properties.getProperty("departcity");
String arrivalCity=properties.getProperty("arrivalcity");

//read the sample date from config properities
String departDate=properties.getProperty("departdate");
String actualDate[]=departDate.split("/");
int month=Integer.parseInt(actualDate[1]);
int month_year=month-1; //as index starts at 0 and till 11
String day=actualDate[0];

By ONEWAY=By.xpath("//input[@value='OneWay' and @id='ctl00_mainContent_rbtnl_Trip_0']");
By DEPARTURECLICK=By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
By DEPARTURE_CITY=By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='"+departCity+"']");
By ARRIVALCLICK=By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");
By ARRIVAL_CITY=By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='"+arrivalCity+"']");


By DATEPICKER_NEXTMONTH=By.xpath("//span[contains(text(),'Next')]");
By DEPART_DATE=By.xpath("//td[@data-month='"+month_year+"']//a[contains(text(),'"+day+"')]");
By PASSENGERS_COUNT=By.xpath("//div[@id='divpaxinfo']");
By PASSENGERS_ADULT=By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']");
By PASSENGERS_CHILD=By.xpath("//select[@id='ctl00_mainContent_ddl_Child']");
By SEARCH=By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");


}
