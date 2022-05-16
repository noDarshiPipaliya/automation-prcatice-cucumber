package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/h5[1]")
    WebElement clickontopslink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement Product;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[2]/span[1]")
    WebElement moreoption;

    @CacheLookup
    @FindBy(name = "color_14")
    WebElement selectcolour;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]")
    WebElement Quantity;

    @CacheLookup
    @FindBy(id = "group_1")
    WebElement SizedropDown;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]")
    WebElement addtoCartButtom;


    public void clickontopslink() {
        clickOnElement(clickontopslink);
    }

    public void clickonproduct() {
        clickOnElement(Product);
    }

    public void clickonmoreoption() {
        clickOnElement(clickontopslink);
    }

    public void clickquantitylink() {
        clickOnElement(Quantity);
       //sendTextToElement(By.xpath("//input[@id='quantity_wanted']"), "2");
    }

    public void selectcolour(){
        clickOnElement(selectcolour);
        //selectByValueFromDropDown(selectcolour,"Blue");
    }

    public void clicksizedropdowmlink() {
        clickOnElement(SizedropDown);
       selectByValueFromDropDown(SizedropDown,"1");
    }


    public void clickaddtocartlink() {
        clickOnElement(addtoCartButtom);
    }


}
