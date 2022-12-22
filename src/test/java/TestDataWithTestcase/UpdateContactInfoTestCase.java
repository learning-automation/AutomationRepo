package TestDataWithTestcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.UpdateContactInfoPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class UpdateContactInfoTestCase {

    Browser br;
    UpdateContactInfoPage updateContactInfoPage;
    WebDriver driver ;
    Properties browser ;
    Properties testCase;

    @BeforeMethod
    public void readTestData(){
        browser = TestDataReader.readProperties("Browser.properties");
        System.out.println(browser);
        br = new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        updateContactInfoPage = new UpdateContactInfoPage(br.getDriver());
    }

    @Test
    public void tc_001_UpdateContactInfoValidCase(){
        testCase = TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        // login.enterUsername(testCase.getProperty("username"));
        // login.enterPassword(testCase.getProperty("password"));
        // login.clickLogIn();
        updateContactInfoPage.enterFirstname(testCase.getProperty("firstname"));
        updateContactInfoPage.enterLastname(testCase.getProperty("lastname"));
        updateContactInfoPage.enterAddress(testCase.getProperty("address"));
        updateContactInfoPage.enterCity(testCase.getProperty("city"));
        updateContactInfoPage.enterState(testCase.getProperty("state"));
        updateContactInfoPage.enterZipcode(testCase.getProperty("zipcode"));
        updateContactInfoPage.enterPhone(testCase.getProperty("phone"));
        updateContactInfoPage.clickUpdate();
        updateContactInfoPage.lnkRegister();
        updateContactInfoPage.lnkUpdateInfo();

        Assert.assertEquals(updateContactInfoPage.lblMsg.getText(),testCase.getProperty("errorMsg"));
    }



}


