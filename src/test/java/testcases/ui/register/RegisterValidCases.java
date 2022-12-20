package testcases.ui.register;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.Register;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class RegisterValidCases {
    Browser br;
    WebDriver driver;
    Register register;
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
        register=new Register(br.getDriver());
    }

    @Test

    public void tc_001_parabank_register()
    {
        testcase=TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        register.clickRegister();
        register.enterFirstName(testcase.getProperty("firstname"));
        register.enterLastName(testcase.getProperty("lastname"));
        register.enterAddress(testcase.getProperty("address"));
        register.enterCity(testcase.getProperty("city"));
        register.enterState(testcase.getProperty("state"));
        register.enterZipCode(testcase.getProperty("zipcode"));
        register.enterPhone(testcase.getProperty("phone"));
        register.enterSsn(testcase.getProperty("ssn"));
        register.enterUserName(testcase.getProperty("username"));
        register.enterPassword(testcase.getProperty("password"));
        register.enterConfirm(testcase.getProperty("confirm"));
        register.clickRegister1();


    }


}
