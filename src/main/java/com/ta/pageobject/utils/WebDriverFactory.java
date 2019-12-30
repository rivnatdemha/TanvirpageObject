package com.ta.pageobject.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    private String browser;
    private WebDriver driver;

    public WebDriverFactory(String browser) {
        this.browser = browser;
    }
    public WebDriver getWebdriver()
    {
        if(browser.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\ProgrammingTutorial\\TanvirPageObjectFramework\\src\\main\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }
}
