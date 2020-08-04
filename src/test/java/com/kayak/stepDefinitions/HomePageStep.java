package com.kayak.stepDefinitions;

import com.kayak.pages.HomePage;
import com.kayak.utilities.CommonMethods;
import com.kayak.utilities.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class HomePageStep extends CommonMethods {
//    HomePage homePage = new HomePage();
    @When("I am on home page")
    public void i_am_on_home_page() {

    }

    @Then("I click on the flight")
    public void i_click_on_the_flight() {

        click(homePage.flightElement);
    }
}
