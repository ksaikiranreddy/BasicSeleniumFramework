package com.application.pages.methods;

import com.application.pages.locators.SelectFlightPagetLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectFlightPageMethods extends SeleniumActions implements SelectFlightPagetLocators {

    WebDriver driver;

    public SelectFlightPageMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void sortFlightByDepartureTime()
    {
        System.out.println("ascending");
        click(DEPART_SORT);
        List<WebElement> beforeSortTime= driver.findElements(DEPART_TIME);
        displayFlightTime(beforeSortTime);

        System.out.println("descending");
        click(DEPART_SORT);
        List<WebElement> afterSortTime= driver.findElements(DEPART_TIME);
        displayFlightTime(afterSortTime);
    }

    public String[] displayFlightTime(List<WebElement> elements)
    {
        int i=0;
        String[] timings = new String[elements.size()];
        for(WebElement element:elements)
        {
            timings[i]=element.getText();
            System.out.println(timings[i]);
        }
        return timings;
    }

    public void continueBtn()
    {
        click(CONTINUE);
    }
}
