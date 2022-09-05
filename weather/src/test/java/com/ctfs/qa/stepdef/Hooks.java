package com.ctfs.qa.stepdef;


import com.cmccarthy.api.config.WeatherAbstractTestDefinition;
import com.cmccarthy.common.utils.HookUtil;
import com.ctfs.qa.config.InitializeAPITestDefinition;
import com.ctfs.qa.config.InitializeContextConfiguration;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

@CucumberContextConfiguration
public class Hooks extends InitializeAPITestDefinition {

    @Autowired
    private HookUtil hookUtil;

    @After
    public void afterScenario(Scenario scenario) {
        hookUtil.endOfTest(scenario);
    }
}