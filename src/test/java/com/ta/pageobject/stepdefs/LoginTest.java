package com.ta.pageobject.stepdefs;

import io.cucumber.java.en.When;
import com.relevantcodes.extentreports.LogStatus;
import com.ta.pageobject.BaseTest;
import com.ta.pageobject.utils.LogUtility;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @When("User navigate to flightbooking site")
    public void user_navigate_to_flightbooking_site() {
        System.out.println("User navigate to flightbooking site");
    }

    @When("User enter correct user name")
    public void user_enter_correct_user_name() {
        System.out.println("User enter correct user name");
    }

    @When("User enter correct password")
    public void user_enter_correct_password() {
        System.out.println("User enter correct password");
    }

    @When("User click login button")
    public void user_click_login_button() {
        System.out.println("User click login button");
    }


}
