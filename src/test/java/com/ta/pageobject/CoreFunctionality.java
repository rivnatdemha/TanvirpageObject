package com.ta.pageobject;

import java.io.IOException;

public class CoreFunctionality extends BaseTest {

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
