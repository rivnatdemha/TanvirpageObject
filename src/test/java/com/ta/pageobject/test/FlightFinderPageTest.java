package com.ta.pageobject.test;

import com.ta.pageobject.BaseTest;
import com.ta.pageobject.CoreFunctionality;
import org.testng.annotations.Test;

import java.io.IOException;

public class FlightFinderPageTest extends BaseTest {

    @Test
    public void bookingFlight() throws IOException {
        init();
        setCurrentPage("Home");
        //gotoURL("https://www.phptravels.net/m-transfer");
        //gotoURL("https://s1.demo.opensourcecms.com/s/44"); //opensourcecms/opensourcecms
        gotoURL("http://newtours.demoaut.com/");
        setText("USERNAME","mercury");
        setText("PASSWORD","mercury");
        clickElement("LOGIN");

        setCurrentPage("Flight Finder");
        clickElement("TYPEROUNDTRIP");
        selectWebElement("PASSENGERS","2");
        selectWebElement("DEPARTFROM","London");
        selectWebElement("ONMONTH","January");
        selectWebElement("ONDAY","14");
        selectWebElement("ARRIVEIN","New York");
        selectWebElement("RETURNINGMONTH","January");
        selectWebElement("RETURNINGDAY","30");
        clickElement("BUSINESSCLASS");
        selectWebElement("AIRLINE","Unified Airlines");
        clickElement("CONTINUE");
    }

}
