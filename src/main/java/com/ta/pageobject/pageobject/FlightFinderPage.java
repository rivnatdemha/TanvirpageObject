package com.ta.pageobject.pageobject;

import com.ta.pageobject.utils.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class FlightFinderPage implements Page {

    //private final WebDriver webDriver;
    private final Map<String, WebElement> webElementMap;
    private WebDriver driver;

    @FindBy(xpath="//input[@value=\"roundtrip\"]")
    WebElement typeRoundTrip;

    @FindBy(xpath="//input[@value=\"oneway\"]")
    WebElement typeOneWayTrip;

    @FindBy(xpath="//select[@name=\"passCount\"]")
    WebElement passengers;

    @FindBy(xpath="//select[@name=\"fromPort\"]")
    WebElement departFrom;

    @FindBy(xpath="//select[@name=\"fromMonth\"]")
    WebElement onMonth;

    @FindBy(xpath="//select[@name=\"fromDay\"]")
    WebElement onDay;

    @FindBy(xpath="//select[@name=\"toPort\"]")
    WebElement arriveIn;

    @FindBy(xpath="//select[@name=\"toMonth\"]")
    WebElement returningMonth;

    @FindBy(xpath="//select[@name=\"toDay\"]")
    WebElement returningDay;

    @FindBy(xpath="//input[@value=\"Coach\"]")
    WebElement econemyClass;

    @FindBy(xpath="//input[@value=\"Business\"]")
    WebElement businessClass;

    @FindBy(xpath="//input[@value=\"First\"]")
    WebElement firstClass;

    @FindBy(xpath="//select[@name=\"airline\"]")
    WebElement airlins;

    @FindBy(name="findFlights")
    WebElement continueButton;


    public FlightFinderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.webElementMap = createWebElementMap();
    }

    private Map<String, WebElement> createWebElementMap()
    {
        Map<String,WebElement> webElementMap = new HashMap<>();
        webElementMap.put("TYPEROUNDTRIP",typeRoundTrip);
        webElementMap.put("TYPEONEWAY",typeOneWayTrip);
        webElementMap.put("PASSENGERS",passengers);
        webElementMap.put("DEPARTFROM",departFrom);
        webElementMap.put("ONMONTH",onMonth);
        webElementMap.put("ONDAY",onDay);
        webElementMap.put("ARRIVEIN",arriveIn);
        webElementMap.put("RETURNINGMONTH",returningMonth);
        webElementMap.put("RETURNINGDAY",returningDay);
        webElementMap.put("ECONOMECLASS",econemyClass);
        webElementMap.put("BUSINESSCLASS",businessClass);
        webElementMap.put("FIRSTCLASS",firstClass);
        webElementMap.put("AIRLINE",airlins);
        webElementMap.put("CONTINUE",continueButton);

        return webElementMap;

    }

    public WebElement getElement(String element)
    {
        return webElementMap.get(element);
    }
}
