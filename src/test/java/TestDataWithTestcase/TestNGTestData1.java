package TestDataWithTestcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.UpdateContactInfoPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class TestNGTestData1 {

    Browser br;
    UpdateContactInfoPage update;
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
        update = new UpdateContactInfoPage(br.getDriver());
    }

    @Test
    public void TC_001(){
        testCase = TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        // login.enterUsername(testCase.getProperty("username"));
        // login.enterPassword(testCase.getProperty("password"));
        // login.clickLogIn();
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

        Assert.assertEquals(update.lblMsg.getText(),testCase.getProperty("errorMsg"));
    }



}


