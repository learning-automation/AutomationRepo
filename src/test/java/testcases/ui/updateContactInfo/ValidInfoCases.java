package testcases.ui.updateContactInfo;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.UpdateContactInfoPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;


public class ValidInfoCases {
    Browser br;
    UpdateContactInfoPage update;
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
        update = new UpdateContactInfoPage(br.getDriver());
    }

    @Test
    public void TC_001_validinfo() {
        testCase = TestDataReader.readProperties("updatevalidInfo.properties");
        br.navigateUrl(browser.getProperty("url"));
        update.enterFirstname(testCase.getProperty("firstname"));
        update.enterLastname(testCase.getProperty("lastname"));
        update.enterAddress(testCase.getProperty("address"));
        update.enterCity(testCase.getProperty("city"));
        update.enterState(testCase.getProperty("state"));
        update.enterZipcode(testCase.getProperty("zipcode"));
        update.enterPhone(testCase.getProperty("phone"));
        update.clickUpdate();
        update.linkRegister();
        update.linkUpdateInfo();
        Reporter.log("Your updated address and phone number have been added to the system.");
    }
    }
