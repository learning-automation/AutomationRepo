package TestDataWithTestcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.UpdateContactInfo;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class TestNGTestData1 {

    Browser br;
    UpdateContactInfo login;
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
        login = new UpdateContactInfo(br.getDriver());
    }

    @Test
    public void TC_001(){
        testCase = TestDataReader.readProperties("update.properties");
        br.navigateUrl(browser.getProperty("url"));
        // login.enterUsername(testCase.getProperty("username"));
        // login.enterPassword(testCase.getProperty("password"));
        // login.clickLogIn();
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

        Assert.assertEquals(login.getMsgElement().getText(), testCase.getProperty("errorMsg"));
    }



}


