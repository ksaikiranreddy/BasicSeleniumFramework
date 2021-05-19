package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.methods.HomePageMethods;
import org.testng.annotations.Test;

public class HomePageTests extends BrowserSetup {

    HomePageMethods homePageMethods;

    @Test
    public void searchFlights() throws InterruptedException {
        homePageMethods=new HomePageMethods(getDriver());
        homePageMethods.navigateSpiceJet();
        homePageMethods.oneWaySelect();
        homePageMethods.departAndArrival();
        homePageMethods.departDateSet();
        homePageMethods.addPassengers();
        homePageMethods.searchFlights();
    }
}
