package com.ta.pageobject.test;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.pageobject.BaseTest;
import com.ta.pageobject.utils.LogUtility;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import java.io.IOException;


public class FlightBookingTest extends BaseTest {
    @Test
    public void bookingFlight() throws IOException {
        Logger log = Logger.getLogger(FlightBookingTest.class);
        log.info("Starting test case");
        test = extent.startTest("Start flight booking test");
        init();

        navigatePage("Home");
        takeScreenShot();
        //gotoURL("https://www.phptravels.net/m-transfer");
        //gotoURL("https://s1.demo.opensourcecms.com/s/44"); //opensourcecms/opensourcecms
        test.log(LogStatus.INFO,"Goto newtour");
        gotoURL("http://newtours.demoaut.com/");
        test.log(LogStatus.INFO,"Enter user name:");
        setText("USERNAME","mercury");
        test.log(LogStatus.INFO,"Enter password");
        setText("PASSWORD","mercury");
        test.log(LogStatus.INFO,"Login");
        clickElement("LOGIN");

        navigatePage("Flight Finder");
        takeScreenShot();
        test.log(LogStatus.INFO,"Select flight type");
        clickElement("TYPEROUNDTRIP");
        test.log(LogStatus.INFO,"Select number of passenger");
        selectWebElement("PASSENGERS","2");
        test.log(LogStatus.INFO,"Select depart city");
        selectWebElement("DEPARTFROM","London");
        test.log(LogStatus.INFO,"Select depart month");
        selectWebElement("ONMONTH","January");
        test.log(LogStatus.INFO,"Select depart day");
        selectWebElement("ONDAY","14");
        test.log(LogStatus.INFO,"Select arrive city");
        selectWebElement("ARRIVEIN","New York");
        test.log(LogStatus.INFO,"Select return month");
        selectWebElement("RETURNINGMONTH","January");
        test.log(LogStatus.INFO,"Select return day");
        selectWebElement("RETURNINGDAY","30");
        test.log(LogStatus.INFO,"Select ticket class");
        clickElement("BUSINESSCLASS");
        test.log(LogStatus.INFO,"Select airlinee");
        selectWebElement("AIRLINE","Unified Airlines");
        test.log(LogStatus.INFO,"Continue");
        clickElement("CONTINUE");

        navigatePage("Select Flight");
        takeScreenShot();
        test.log(LogStatus.INFO,"Choose depart flight");
        clickElement("DEPARTFLIGHT");
        test.log(LogStatus.INFO,"Choose return flight");
        clickElement("RETURNFLIGHT");
        test.log(LogStatus.INFO,"Continue");
        clickElement("CONTINUE");

        extent.endTest(test);
        extent.flush();

    }
}
