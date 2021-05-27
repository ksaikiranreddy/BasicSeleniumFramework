package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.utilities.seleniumutils.SingletonClass;
import org.testng.annotations.Test;

public class HomePageTests extends BrowserSetup {

    SingletonClass instance;

    @Test(priority = 0)
    public void searchFlights() throws InterruptedException {

        instance.getInstanceHomePage().navigateSpiceJet();
        instance.getInstanceHomePage().oneWaySelect();
        instance.getInstanceHomePage().departAndArrival();
        instance.getInstanceHomePage().departDateSet();
        instance.getInstanceHomePage().addPassengers();
        instance.getInstanceHomePage().searchFlights();
    }

    @Test(dependsOnMethods = "searchFlights")
    public void selectFlight() throws InterruptedException {
        instance.getInstanceSelectFlightPage().sortFlightByDepartureTime();
        instance.getInstanceSelectFlightPage().continueBtn();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectFlight")
    public void fillTravellerDetails() throws InterruptedException {
        instance.getInstanceTravellerDetailsPage().fillPassengerDetails();
    }
}
