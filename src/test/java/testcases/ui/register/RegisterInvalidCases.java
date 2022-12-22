package testcases.ui.register;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.RegisterPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class RegisterInvalidCases {
    WebDriver driver;
    Browser br;
    RegisterPage registerPage;
    Properties browser;
    Properties testcase;

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
        registerPage=new RegisterPage(br.getDriver());
    }

    @Test
    public void tc_001_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterFirstName(testcase.getProperty("firstname"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_002_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterLastName(testcase.getProperty("lastname"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_003_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterAddress(testcase.getProperty("address"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_004_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterCity(testcase.getProperty("city"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_005_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterState(testcase.getProperty("state"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_006_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterZipCode(testcase.getProperty("zipcode"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_007_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterPhone(testcase.getProperty("phone"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_008_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterSsn(testcase.getProperty("ssn"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_009_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterUserName(testcase.getProperty("username"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_010_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterPassword(testcase.getProperty("password"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_011_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterConfirm(testcase.getProperty("confirm"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_012_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterFirstName(testcase.getProperty("firstname"));
        registerPage.enterConfirm(testcase.getProperty("confirm"));
        registerPage.clickRegister1();
    }
}
