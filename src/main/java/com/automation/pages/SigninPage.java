package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SigninPage extends Utility {

    private static final Logger log = LogManager.getLogger(SigninPage.class.getName());

    public SigninPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "email")
    WebElement Email;

    @CacheLookup
    @FindBy(id = "passwd")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement SignButton;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createaccountbutton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;


    public void clickemaillink(String username) {
        clickOnElement(Email);
    }

    public void clickpasswordlink(String password) {
        clickOnElement(Password);
    }

    public void clicksigninbuttonlink() {
        clickOnElement(SignButton);
    }

    public void clickcreateaccountlink() {
        clickOnElement(createaccountbutton);
    }

    public void clickauthenticationlink() {
        clickOnElement(authenticationText);
    }

    public void clickcreateaccountTextlink() {
        clickOnElement(createAnAccountText);
    }

    public void messageelement(String message) {

    }


    public void signinToApplication(String username, String password, String message) {
        clickemaillink(username);
        clickpasswordlink(password);
        clickcreateaccountlink();
    }


}
