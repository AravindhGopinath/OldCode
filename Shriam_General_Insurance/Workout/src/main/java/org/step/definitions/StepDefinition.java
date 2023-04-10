package org.step.definitions;

import io.cucumber.java.en.*;
import org.locators.Xpaths;
import org.openqa.selenium.WebElement;

public class StepDefinition {


    @Given("Must login with Url")
    public void must_login_with_url() {

        WebElement username = Xpaths.getInstance().getUsername();
        username.click();
        username.sendKeys();


    }

    @Then("User entered the vehicle Number is <{string}>")
    public void user_entered_the_vehicle_number_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("click the continue button")
    public void click_the_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
