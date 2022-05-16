package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomencatogeryPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public WomencatogeryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement WomenText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/h5[1]/a[1]")
    WebElement Dresses;

    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement SortbyDropdown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[2]")
    WebElement selectproduct;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement selectquantity;


    public void clickwomentextlink() {
        clickOnElement(WomenText);
    }


    public void clickdresseslink() {
        clickOnElement(Dresses);
    }

    public void clicksortbylink() {
        clickOnElement(SortbyDropdown);
        selectByValueFromDropDown(By.id("selectProductSort"), "Price: Lowest first");
    }

    public void selectproduct(){
        clickOnElement(selectproduct);
        selectByValueFromDropDown(selectproduct,"Printed Dress");
    }

    public void selectquantity(){
        clickOnElement(selectquantity);
        selectByValueFromDropDown(selectquantity,"2");
    }
}
