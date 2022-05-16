package com.automation.steps;

import com.automation.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageTest {


    @Given("^I click on women link$")
    public void iClickOnWomenLink() {
        new HomePage().clickOnwomenlink();
    }

    @When("^I click on dresses link$")
    public void iClickOnDressesLink() {
        new HomePage().clickOndressesLink();
    }

    @And("^I click on t-shirt link$")
    public void iClickOnTShirtLink() {
        new HomePage().clickOntshirtsLink();
    }

    @And("^I click on signin link$")
    public void iClickOnSigninLink() throws Throwable{
        new HomePage().clickOnsighinLink();
    }

    @Then("^get display logo$")
    public void getDisplayLogo() {
        new HomePage().setDisplaylogo();
    }
}
