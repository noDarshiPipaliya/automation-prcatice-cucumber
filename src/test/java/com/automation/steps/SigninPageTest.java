package com.automation.steps;

import com.automation.pages.SigninPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninPageTest {

    @When("^I click on enter email address$")
    public void iClickOnEnterEmailAddress() {
        new SigninPage().clickemaillink("devanshi@gmail.com");
    }

    @And("^I click on password field$")
    public void iClickOnPasswordField() {
        new SigninPage().clickpasswordlink("devanshi");
    }

    @And("^I click on signin button$")
    public void iClickOnSigninButton() {
        new SigninPage().clicksigninbuttonlink();
    }

    @And("^I click on create account button$")
    public void iClickOnCreateAccountButton() {
        new SigninPage().clickcreateaccountTextlink();
    }

    @And("^I get authentication text$")
    public void iGetAuthenticationText() {
        new SigninPage().clickauthenticationlink();
    }

    @Then("^I get create account text$")
    public void iGetCreateAccountText() {
        new SigninPage().clickcreateaccountTextlink();
    }
}
