package com.ta.pageobject.pageobject;

import com.ta.pageobject.utils.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class HomePage implements Page {

    //private final WebDriver webDriver;
    private final Map<String, WebElement> webElementMap;
    private WebDriver driver;

    @FindBy(name="userName")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="login")
    WebElement login;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.webElementMap = createWebElementMap();
    }

    private Map<String, WebElement> createWebElementMap()
    {
        Map<String,WebElement> webElementMap = new HashMap<>();
        webElementMap.put("USERNAME",username);
        webElementMap.put("PASSWORD",password);
        webElementMap.put("LOGIN",login);

        return webElementMap;

    }

    public WebElement getElement(String element)
    {
        return webElementMap.get(element);
    }
}
