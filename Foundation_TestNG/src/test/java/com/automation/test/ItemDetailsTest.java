package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemDetailsTest extends BaseTest{

    @Test
    public void isItemNameIsSameAsThatOfTheListingPage() throws InterruptedException {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnTShirtLink();
        Assert.assertEquals("T-Shirts", homePage.TShirtPage());
        String title = itemDetailsPage.titleFromListingpage();
        itemDetailsPage.clickOnItem();
        Assert.assertEquals(title,itemDetailsPage.titleFromProductPage());
    }
}
