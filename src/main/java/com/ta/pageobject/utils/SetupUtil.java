package com.ta.pageobject.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Properties;

public class SetupUtil {
    String page;
    String browser;
    Page currentPage;
    WebDriverFactory webDriverFactory;
    WebDriver driver;
    PageUtil pageUtil;
    public ExtentReports extent = ExtendManager.getInstance();
    public ExtentTest test;
    public PropertiesUtility propertiesUtility;
    public Properties properties;
    public LogUtility log;
    //public WaitUtil wait;

    public void init() throws IOException {
        this.properties = propertiesUtility.readPropertiesFile();
        this.browser = properties.getProperty("browser");
        this.webDriverFactory = new WebDriverFactory(browser);
        this.driver = webDriverFactory.getWebdriver();
        this.pageUtil = new PageUtil(driver);
        //this.wait = new WaitUtil(driver);
    }
    public void setCurrentPage(String page)
    {
        this.currentPage = pageUtil.getPage(page);
        if(currentPage==null)
        {
            test.log(LogStatus.FAIL,"Page not found: "+page);
        }
    }

    public String getPage() {
        return page;
    }

    public String getBrowser() {
        return browser;
    }

    public Page getCurrentPage()
    {
        return currentPage;
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public void gotoURL(String url)
    {
        driver.get(url);
    }

    //public WebDriverWait getWait(){return wait.getWait();}
}

