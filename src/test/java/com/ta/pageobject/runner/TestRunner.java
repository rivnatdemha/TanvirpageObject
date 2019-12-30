package com.ta.pageobject.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {},
        dryRun = false,
        strict = true,
        monochrome = true,
        features = {"src/test/resources/"},
        glue = {"com.ta.pageobject.stepdefs"},
        plugin = {"pretty",
                "html:target/site/cucumber-html",
            "json:target/cucumber1.json"}
)
public class TestRunner {
}
