
package testcases.ui.updateContactInfo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.UpdateContactInfoPage;
import utility.Browser;
import utility.TestDataReader;

import  java.util.Properties;

public class UpdateContactInfoInvalidCases {

    WebDriver driver;
    Browser br;
    UpdateContactInfoPage updateContactInfoPage;
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
        updateContactInfoPage=new UpdateContactInfoPage(br.getDriver());
    }

    @Test
    public void tc_001_invalidUpdateContactInfo()
    {
        testcase= TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.enterFirstname(testcase.getProperty("firstname"));
        updateContactInfoPage.lnkUpdateInfo();
    }
    @Test
    public void tc_002_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.enterLastname(testcase.getProperty("lastname"));
        updateContactInfoPage.lnkUpdateInfo();
    }
    @Test
    public void tc_003_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.enterAddress(testcase.getProperty("address"));
        updateContactInfoPage.lnkUpdateInfo();
    }
    @Test
    public void tc_004_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.enterCity(testcase.getProperty("city"));
        updateContactInfoPage.lnkUpdateInfo();
    }
    @Test
    public void tc_005_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.enterState(testcase.getProperty("state"));
        updateContactInfoPage.lnkUpdateInfo();
    }
    @Test
    public void tc_006_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.enterZipcode(testcase.getProperty("zipcode"));
        updateContactInfoPage.lnkUpdateInfo();
    }
    @Test
    public void tc_007_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.enterPhone(testcase.getProperty("phone"));
        updateContactInfoPage.lnkUpdateInfo();
    }
  /*  @Test
    public void tc_008_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterSsn(testcase.getProperty("ssn"));
        registerPage.lnkUpdateInfo();
    }
    @Test
    public void tc_009_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterUserName(testcase.getProperty("username"));
        registerPage.lnkUpdateInfo();
    }
    @Test
    public void tc_010_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterPassword(testcase.getProperty("password"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_011_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterConfirm(testcase.getProperty("confirm"));
        registerPage.clickRegister1();
    }
    @Test
    public void tc_012_invalidUpdateContactInfo_parabank()
    {
        testcase= TestDataReader.readProperties("register.properties");
        br.navigateUrl(browser.getProperty("url"));
        registerPage.clickRegister();
        registerPage.enterFirstName(testcase.getProperty("firstname"));
        registerPage.enterConfirm(testcase.getProperty("confirm"));
        registerPage.clickRegister1();
    }*/
}
