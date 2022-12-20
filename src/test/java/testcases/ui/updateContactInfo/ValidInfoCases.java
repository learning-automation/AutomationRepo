package testcases.ui.updateContactInfo;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.UpdateContactInfo;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;


public class ValidInfoCases {
    Browser br;
    UpdateContactInfo login;
    WebDriver driver ;
    Properties browser ;
    Properties testCase;

    @BeforeMethod
    public void readTestData(){
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new UpdateContactInfo(br.getDriver());
    }

    @Test
    public void TC_001_validinfo() {
        testCase = TestDataReader.readProperties("updatevalidInfo.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterFirstname(testCase.getProperty("firstname"));
        login.enterLastname(testCase.getProperty("lastname"));
        login.enterAddress(testCase.getProperty("address"));
        login.enterCity(testCase.getProperty("city"));
        login.enterState(testCase.getProperty("state"));
        login.enterZipcode(testCase.getProperty("zipcode"));
        login.enterPhone(testCase.getProperty("phone"));
        login.clickUpdate();
        login.clickRegister();
        login.clickUpdateInfo();
        Reporter.log("Your updated address and phone number have been added to the system.");
    }
    }
