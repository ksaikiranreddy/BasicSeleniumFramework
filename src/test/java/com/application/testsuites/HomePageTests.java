package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.methods.HomePageMethods;
import com.application.pages.methods.SelectFlightPageMethods;
import com.application.pages.methods.TravellerDetailsPageMethods;
import org.testng.annotations.Test;

public class HomePageTests extends BrowserSetup {

    HomePageMethods homePageMethods;
    SelectFlightPageMethods selectFlightPageMethods;
    TravellerDetailsPageMethods travellerDetailsPageMethods;

    @Test(priority = 0)
    public void searchFlights() throws InterruptedException {
        homePageMethods=new HomePageMethods(getDriver());
        homePageMethods.navigateSpiceJet();
        homePageMethods.oneWaySelect();
        homePageMethods.departAndArrival();
        homePageMethods.departDateSet();
        homePageMethods.addPassengers();
        homePageMethods.searchFlights();
    }

    @Test(priority = 1)
    public void selectFlight() throws InterruptedException {
        selectFlightPageMethods=new SelectFlightPageMethods(getDriver());
        selectFlightPageMethods.sortFlightByDepartureTime();
        selectFlightPageMethods.continueBtn();
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void fillTravellerDetails() throws InterruptedException {
        travellerDetailsPageMethods=new TravellerDetailsPageMethods(getDriver());
        travellerDetailsPageMethods.fillPassengerDetails();
    }
}
