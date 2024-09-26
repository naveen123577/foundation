package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.ItemDetailsPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage homePage;
    ItemDetailsPage itemDetailsPage;

    @BeforeMethod
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
        homePage = new HomePage();
        itemDetailsPage = new ItemDetailsPage();
    }
    @AfterMethod
    public void clean(){
        DriverManager.getDriver().quit();
    }
}
