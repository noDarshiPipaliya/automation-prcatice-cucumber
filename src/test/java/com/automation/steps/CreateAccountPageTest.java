package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountPageTest {

    @When("^I click on E-mail address$")
    public void iClickOnEMailAddress() {
        new CreateAccountPage().clickEmail("darshil@gmail.com");
    }

    @And("^I click on firstname field$")
    public void iClickOnFirstnameField() {
        new CreateAccountPage().clickfirstnamelink("devanshi");

    }

    @And("^I click on lastname field$")
    public void iClickOnLastnameField() {
        new CreateAccountPage().clicklastnamelink("patel");
    }

    @And("^I click on email field$")
    public void iClickOnEmailField() {
        new CreateAccountPage().clickemaillink("darshil@gmail.com");
    }

    @And("^I click on password$")
    public void iClickOnPassword() {
        new CreateAccountPage().clickpasswordlink("devanshi");
    }

    @And("^I click on add firstname$")
    public void iClickOnAddFirstname() {
        new CreateAccountPage().clickaddfirstnamelink("devanshi");
    }

    @And("^I click on add lastname$")
    public void iClickOnAddLastname() {
        new CreateAccountPage().clickaddlastnamelink("patel");
    }

    @And("^I click on address field$")
    public void iClickOnAddressField() {
        new CreateAccountPage().clickaddresslink("watford");
    }

    @And("^I click on city field$")
    public void iClickOnCityField() {
        new CreateAccountPage().clickcitylink("watford");
    }

    @And("^I click on state field$")
    public void iClickOnStateField() {
        new CreateAccountPage().clickstatelink("northern irland");
    }

    @And("^I click on zip code dield$")
    public void iClickOnZipCodeDield() {
        new CreateAccountPage().clickzipcodelink("123456");
    }

    @And("^I click on country field$")
    public void iClickOnCountryField() {
        new CreateAccountPage().clickcountrylink("United Kingdom");
    }

    @And("^I click on phone number field$")
    public void iClickOnPhoneNumberField() {
        new CreateAccountPage().clickmobilephonelink("1234567890");
    }

    @And("^I click on reference field$")
    public void iClickOnReferenceField() {
        new CreateAccountPage().clickreferencelink("good");
    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickregisterbuttonlink();
    }
}
