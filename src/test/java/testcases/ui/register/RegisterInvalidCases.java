package testcases.ui.register;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.Register;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class RegisterInvalidCases {
    WebDriver driver;
    Browser br;
    Register registerInvalidCases;
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
        registerInvalidCases=new Register(br.getDriver());
    }

    @Test
    public void tc_001_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterFirstName(testcase.getProperty("firstname"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_002_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterLastName(testcase.getProperty("lastname"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_003_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterAddress(testcase.getProperty("address"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_004_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterCity(testcase.getProperty("city"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_005_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterState(testcase.getProperty("state"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_006_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterZipCode(testcase.getProperty("zipcode"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_007_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterPhone(testcase.getProperty("phone"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_008_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterSsn(testcase.getProperty("ssn"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_009_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterUserName(testcase.getProperty("username"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_010_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterPassword(testcase.getProperty("password"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_011_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterConfirm(testcase.getProperty("confirm"));
        registerInvalidCases.clickRegister1();
    }
    @Test
    public void tc_012_invalidregister_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerInvalidCases.clickRegister();
        registerInvalidCases.enterFirstName(testcase.getProperty("firstname"));
        registerInvalidCases.enterConfirm(testcase.getProperty("confirm"));
        registerInvalidCases.clickRegister1();
    }
}
