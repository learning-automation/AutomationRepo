package testcases.ui.login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class LoginInValidCases {

    Browser br;
    LoginPage login;
    WebDriver driver ;
    Properties browser ;
    Properties testCase;

    @BeforeSuite
    public void readBrowser(){
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readTestData(){
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
    }
    @Test
    public void tc001_parabank_invalidlogin(){
        testCase = TestDataReader.readProperties("tc001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testCase.getProperty("username"));
        login.enterPassword(testCase.getProperty("password"));
        login.clickLogIn();
        Assert.assertEquals(login.getErrorElement().getText(), testCase.getProperty("errorMsg"));
    }

    // @Test - only enter username -> click login -> validate error
    // @Test - only enter password -> click login -> validate error
    // @Test -> blank -> click login -> validate error




}
