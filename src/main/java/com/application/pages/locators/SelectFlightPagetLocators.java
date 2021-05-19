package com.application.pages.locators;

import org.openqa.selenium.By;

public interface SelectFlightPagetLocators {

    By DEPART_SORT=By.xpath("//th[text()='Depart']");
    By DEPART_TIME=By.xpath("//div[@class='deptStation departure-time']");
    By CONTINUE=By.xpath("//span[@class='button-continue-text']");
}
