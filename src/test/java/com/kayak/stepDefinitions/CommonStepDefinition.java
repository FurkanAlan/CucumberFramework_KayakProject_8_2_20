package com.kayak.stepDefinitions;

import com.kayak.utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefinition extends CommonMethods {

    @Given("User enter \"(.*)\" and \"(.*)\"")
    public void credentialInputs(String username, String password) {
//        sendText(username,username);
    }
    @Then("User is click on login button")
    public void loginToAccount(){

    }



}
