package com.briteerp.step_definitions;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefinition {

    @Given("I am on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
