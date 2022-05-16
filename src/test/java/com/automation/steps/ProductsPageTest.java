package com.automation.steps;

import com.automation.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductsPageTest {
    @When("^I click on tops link$")
    public void iClickOnTopsLink()throws Throwable {
        new ProductPage().clickontopslink();
    }

    @And("^I click on products$")
    public void iClickOnProducts()throws Throwable {
        new ProductPage().clickonproduct();
    }

    @And("^I click on more option$")
    public void iClickOnMoreOption() throws Throwable{
        new ProductPage().clickonmoreoption();
    }

    @And("^I click on colour link$")
    public void iClickOnColourLink()throws Throwable {
        new ProductPage().selectcolour();
    }

    @And("^I click on quantity link$")
    public void iClickOnQuantityLink()throws Throwable {
        new ProductPage().clickquantitylink();
    }

    @And("^I click on size drop down$")
    public void iClickOnSizeDropDown()throws Throwable {
        new ProductPage().clicksizedropdowmlink();
    }

    @Then("^I click on add to cart button$")
    public void iClickOnAddToCartButton() throws Throwable{
        new ProductPage().clickaddtocartlink();
    }
}
