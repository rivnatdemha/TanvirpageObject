package com.ta.pageobject.utils;

import com.ta.pageobject.pageobject.FlightFinderPage;
import com.ta.pageobject.pageobject.HomePage;
import com.ta.pageobject.pageobject.SelectFlightPage;
import org.openqa.selenium.WebDriver;

public class PageUtil {
    WebDriver driver;
    Page currentPage;


    public PageUtil(WebDriver driver) {
        this.driver = driver;
    }

    public Page getPage(String page)
    {
        if(page.equals("Home"))
        {
            currentPage = new HomePage(driver);
        }
        if(page.equals("Flight Finder"))
        {
            currentPage = new FlightFinderPage(driver);
        }
        if(page.equals("Select Flight"))
        {
            currentPage = new SelectFlightPage(driver);
        }

        return currentPage;
    }
}
