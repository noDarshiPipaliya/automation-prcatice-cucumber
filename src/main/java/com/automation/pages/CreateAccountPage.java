package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement Emailaddress;

    @CacheLookup
    @FindBy(id = "customer_firstname")
    WebElement FirstName;

    @CacheLookup
    @FindBy(id = "customer_lastname")
    WebElement LastName;

    @CacheLookup
    @FindBy(id = "email")
    WebElement Email;

    @CacheLookup
    @FindBy(id = "passwd")
    WebElement Password;

    @CacheLookup
    @FindBy(id = "firstname")
    WebElement AddFirstname;

    @CacheLookup
    @FindBy(id = "lastname")
    WebElement AddLastname;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement Address;

    @CacheLookup
    @FindBy(id = "city")
    WebElement City;

    @CacheLookup
    @FindBy(id = "id_state")
    WebElement State;

    @CacheLookup
    @FindBy(id = "postcode")
    WebElement Zipcode;

    @CacheLookup
    @FindBy(id = "id_country")
    WebElement Country;

    @CacheLookup
    @FindBy(id = "phone_mobile")
    WebElement Mobilephone;

    @CacheLookup
    @FindBy(id = "alias")
    WebElement Reference;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement Registerbutton;

    public void clickEmail(String Email){clickOnElement(Emailaddress);}

    public void clickfirstnamelink(String firstname) {
        clickOnElement(FirstName);
    }

    public void clicklastnamelink(String lastname) {
        clickOnElement(LastName);
    }

    public void clickemaillink(String email) {
        clickOnElement(Email);
    }

    public void clickpasswordlink(String password) {
        clickOnElement(Password);
    }

    public void clickaddfirstnamelink(String addfirstname) {
        clickOnElement(AddFirstname);
    }

    public void clickaddlastnamelink(String addlastname) {
        clickOnElement(AddLastname);
    }

    public void clickaddresslink(String address) {
        clickOnElement(Address);
    }

    public void clickcitylink(String city) {
        clickOnElement(City);
    }

    public void clickstatelink(String state) {
        clickOnElement(State);
        selectByValueFromDropDown(By.id("id_state"), "22");
    }

    public void clickzipcodelink(String zipcode) {
        clickOnElement(Zipcode);
    }

    public void clickcountrylink(String country) {
        clickOnElement(Country);
        selectByValueFromDropDown(By.id("id_country"), "21");
    }

    public void clickmobilephonelink(String phonenumber) {
        clickOnElement(Mobilephone);
    }

    public void clickreferencelink(String reference) {
        clickOnElement(Reference);
    }

    public void clickregisterbuttonlink() {
        clickOnElement((By) Registerbutton);
    }

    // public void messageelement(String message){

}


