package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = "#dropdownMenuLink")
    WebElement cartIcon;

    @FindBy(xpath = "//li[@id='361']")
    WebElement tShirtLink;

    @FindBy(xpath = "//div[@class='left-product']/child::h1")
    WebElement tShirtPageTitle;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("base.url"));
    }

    public boolean isHomePageDisplayed() {
        return cartIcon.isDisplayed();
    }

    public void clickOnTShirtLink() throws InterruptedException {
        tShirtLink.click();
        Thread.sleep(4000);
    }

    public String TShirtPage() {
        return tShirtPageTitle.getText();
    }
}
