package com.ta.pageobject.pageobject;

import com.ta.pageobject.utils.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class SelectFlightPage implements Page {
    private final Map<String, WebElement> webElementMap;
    private WebDriver driver;

    @FindBy(xpath="//input[@value=\"Blue Skies Airlines$361$271$7:10\"]")
    WebElement departFlight;

    @FindBy(xpath="//input[@value=\"Pangea Airlines$632$282$16:37\"]")
    WebElement returnFlight;

    @FindBy(name="reserveFlights")
    WebElement continueButton;


    public SelectFlightPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.webElementMap = createWebElementMap();
    }

    private Map<String, WebElement> createWebElementMap()
    {
        Map<String,WebElement> webElementMap = new HashMap<>();
        webElementMap.put("DEPARTFLIGHT",departFlight);
        webElementMap.put("RETURNFLIGHT",returnFlight);
        webElementMap.put("CONTINUE",continueButton);

        return webElementMap;

    }

    public WebElement getElement(String element)
    {
        return webElementMap.get(element);
    }
}
