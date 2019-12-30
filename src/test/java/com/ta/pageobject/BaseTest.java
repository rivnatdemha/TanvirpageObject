package com.ta.pageobject;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.pageobject.utils.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BaseTest extends SetupUtil {


    public void setText(String webElementName, String value)
    {
        test.log(LogStatus.INFO,"Set text in to "+webElementName+":"+value);
        WebElement elementC = getElement(webElementName);
        elementC.sendKeys(value);
    }

    public void clickElement(String webElementName)
    {
        test.log(LogStatus.INFO,"Click the element"+webElementName);
            WebElement elementC = getElement(webElementName);
            elementC.click();

    }

    public void selectWebElement(String webElementName,String value)
    {
        test.log(LogStatus.INFO,"Select value "+value+"from "+webElementName);
        WebElement elementC = getElement(webElementName);
        Select dropdown = new Select(elementC);
        dropdown.selectByVisibleText(value);
    }


    private WebElement getElement(String Element)
    {

        WebElement currentWebElement = getCurrentPage().getElement(Element);
            //getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Need to provide xpath")));
        if(currentWebElement==null)
        {
            test.log(LogStatus.FAIL,"WebElement not found: "+Element);
        }
        else
        {
            test.log(LogStatus.PASS,"WebElement found: "+Element);
        }
        return  currentWebElement;

    }

    public void navigatePage(String page)
    {
        setCurrentPage(page);
    }


    public void takeScreenShot()
    {
        Date date = new Date();
        String screenShotFile = date.toString().replace(":","-").replace(" ","-")+".png";
        String filePath = System.getProperty("user.dir")+"\\ScreenCapture\\"+screenShotFile;
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(scrFile,new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.log(LogStatus.INFO,test.addScreenCapture(filePath));
    }



}
