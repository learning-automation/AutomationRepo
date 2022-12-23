package testcases.ui.accountoverviews;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.AccountOverviewPage;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class AccountOverviewValidCases {
    Browser br;
    LoginPage login;
    AccountOverviewPage accountoverviewpage;
    WebDriver driver;
    Properties browser;
    Properties testcase;

    @BeforeSuite
    public void readBrowser(){
        browser= TestDataReader.readProperties("Browser.properties");
        br=new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readTestData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
        accountoverviewpage = new AccountOverviewPage(br.getDriver());
        testcase = TestDataReader.readProperties("tc001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testcase.getProperty("username"));
        login.enterPassword(testcase.getProperty("password"));
        login.clickLogIn();
    }

    @Test

    public void tc001_acntoverview_validcase1(){
        br.navigateUrl(browser.getProperty("url"));
        accountoverviewpage.clickAccountOverview();
        accountoverviewpage.clickAccountId();
        accountoverviewpage.clickSelectMonths();
        accountoverviewpage.clickAccountType();
        accountoverviewpage.clickgobutton();
    }



}

