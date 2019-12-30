package com.ta.pageobject.test;

import com.ta.pageobject.BaseTest;
import org.junit.After;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {
    /*public LoginTest(String page, String browser) {
        super("Home", "firefox");
    }*/


    @Test
    public void doLogin() throws IOException {
        init();
        //gotoURL("https://www.phptravels.net/m-transfer");
        //gotoURL("https://s1.demo.opensourcecms.com/s/44"); //opensourcecms/opensourcecms
        gotoURL("http://newtours.demoaut.com/");
        setText("USERNAME","mercury");
        setText("PASSWORD","mercury");
        clickElement("LOGIN");
    }


}
