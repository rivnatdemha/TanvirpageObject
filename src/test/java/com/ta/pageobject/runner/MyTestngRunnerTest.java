package com.ta.pageobject.runner;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"com.ta.pageobject.stepdefs"}
        /*plugin = {"html:target/cucumber-report/cucumber-pretty",
                "json:target/cucumber-report/cucumberTestReport.json",
                "return:target/cucumber-report/return.txt"
        }*/
)
public class MyTestngRunnerTest extends AbstractTestNGCucumberTests {
}
