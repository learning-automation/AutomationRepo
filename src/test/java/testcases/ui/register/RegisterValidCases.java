package testcases.ui.register;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.RegisterPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class RegisterValidCases {
    Browser br;
    WebDriver driver;
    RegisterPage registerPage;
    Properties testcase;
    Properties browser;

    @BeforeSuite
    public void readBrowser()
    {
        browser= TestDataReader.readProperties("Browser.properties");
        br=new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readTestData()
    {
        br.launchBrowser();
        br.maximize();
        driver=br.getDriver();
        registerPage=new RegisterPage(br.getDriver());
    }

    @Test

    public void tc_001_parabank_register()
    {
        testcase=TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterFirstName(testcase.getProperty("firstname"));
        registerPage.enterLastName(testcase.getProperty("lastname"));
        registerPage.enterAddress(testcase.getProperty("address"));
        registerPage.enterCity(testcase.getProperty("city"));
        registerPage.enterState(testcase.getProperty("state"));
        registerPage.enterZipCode(testcase.getProperty("zipcode"));
        registerPage.enterPhone(testcase.getProperty("phone"));
        registerPage.enterSsn(testcase.getProperty("ssn"));
        registerPage.enterUserName(testcase.getProperty("username"));
        registerPage.enterPassword(testcase.getProperty("password"));
        registerPage.enterConfirm(testcase.getProperty("confirm"));
        registerPage.clickRegister1();


    }


}
