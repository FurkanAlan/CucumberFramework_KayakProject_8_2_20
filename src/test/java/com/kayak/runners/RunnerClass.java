package com.kayak.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"

        , glue = "com/kayak/stepDefinitions"


//        , dryRun = true
        , plugin = {"pretty", "html:target/html/cucumber-default", "json:target/cucumber.json", "rerun:target/failed.txt"}
)

public class RunnerClass {

}
