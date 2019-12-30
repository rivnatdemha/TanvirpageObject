package com.ta.pageobject.utils;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;
import java.util.Date;

public class ExtendManager {
    public static ExtentReports extent;

    public static ExtentReports getInstance()
    {
        if(extent == null){
            Date d =new Date();
            String fileName = d.toString().replace(":","_").replace(" ","_")+".html";
            extent = new ExtentReports("D:\\ProgrammingTutorial\\TanvirPageObjectFramework\\ExtentReport\\"+fileName,true, DisplayOrder.NEWEST_FIRST);
            extent.loadConfig(new File(System.getProperty("usr.dir")+"extent-config.xml"));
            extent.addSystemInfo("Selenium Version","2.53.0").addSystemInfo("Environment","QA");
        }
        return extent;
    }
}
