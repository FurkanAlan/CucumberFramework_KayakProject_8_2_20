package com.kayak.stepDefinitions;

import com.kayak.utilities.CommonMethods;
import com.kayak.utilities.ConfigurationReader;
import com.kayak.utilities.MyDriver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends CommonMethods {

    @Before

    public void setup() {

        System.out.println("#### setup! start d######\n");

        MyDriver.get().manage().window().maximize();
        MyDriver.get().get(ConfigurationReader.getProperty("Url"));
        initializeAllPages();
    }

    @After
    public void teardown(Scenario scenario) {
        //if test failed - do this
        if (scenario.isFailed()) {
            System.out.println("Test failed! Check your ScreenShot");
            byte[] screenshot = ((TakesScreenshot) MyDriver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else {
            System.out.println("Cleanup!");
            System.out.println("Test completed! Thumbs Up");
        }
        System.out.println("###########-THE END-###################");
        //after every test, we gonna close browser
        MyDriver.quitBrowser();
    }

}
