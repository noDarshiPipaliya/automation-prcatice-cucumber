package com.automation.steps;

import com.automation.pages.WomencatogeryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WomenCatogeryPageTest {
    @And("^I click on sort by$")
    public void iClickOnSortBy() {
        new WomencatogeryPage().clicksortbylink();
    }

    @And("^I click on product$")
    public void iClickOnProduct() {
        new WomencatogeryPage().selectproduct();
    }

    @Then("^I click on quantity$")
    public void iClickOnQuantity() {
        new WomencatogeryPage().selectquantity();
    }
}
