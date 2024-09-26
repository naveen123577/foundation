package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemDetailsPage extends BasePage{

    @FindBy(xpath = "//div[@id='product-0']")
    WebElement item;

    @FindBy(xpath = "//div[@id='product-0']/div/div/figcaption/a/h4")
    WebElement listingPageItemTitle;

    @FindBy(css = ".Productdetails_first-info-block__o2kN4 h1")
    WebElement productPageItemTitle;

    public void clickOnItem() {
        item.click();
    }

    public String titleFromListingpage() {
        return listingPageItemTitle.getText();
    }

    public String titleFromProductPage() {
        return productPageItemTitle.getText();
    }

}
