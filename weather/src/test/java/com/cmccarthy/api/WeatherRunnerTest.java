package com.cmccarthy.api;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {
                "src/test/resources/feature/intialize.feature"
       },glue="com.ctfs.qa.stepdef",
        		plugin = { "summary", "json:target/cucumber-json.json",
        "tech.grasshopper.AllureCucumberMappingPlugin:target/cucumber-allure.json" })
public class WeatherRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

