package com.automation;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(   // aqui se coloca doble click al control-> maven clean : borarr

        plugin = {"pretty"}
        ,features = "src/test/resources/features"
        ,glue = "com.automation.web.step"
        ,tags = "@Cabinas"
        //,tags = "@PeruRail"
)
public class Runner {}
