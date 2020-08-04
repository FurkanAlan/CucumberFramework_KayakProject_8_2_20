package com.kayak.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt"
        , glue = "com/kayak/stepDefinitions"
        , plugin = {
        "html:target/rerun-default-cucumber-reports",
        "json:target/cucumber_failure.json"})

public class FailedRunner {
}
