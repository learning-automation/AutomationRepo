package testcases.ui.openNewAccount;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.OpenNewAccountPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;



public class OpenNewAccountValidCases {
    Browser br;
    LoginPage loginPage;
    OpenNewAccountPage openNewAccountPage;
    WebDriver driver;
    Properties browser;
    Properties testcase;
    @BeforeSuite
    public void readBrowser(){
        browser= TestDataReader.readProperties("Browser.properties");
        br=new Browser(browser.getProperty("browser"));
    }
    @BeforeMethod
    public void readtestData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        loginPage = new LoginPage(br.getDriver());
        openNewAccountPage= new OpenNewAccountPage(br.getDriver());
        testcase = TestDataReader.readProperties("TC_001.properties");
        br.navigateUrl(browser.getProperty("url"));
        loginPage.enterUsername(testcase.getProperty("username"));
        loginPage.enterPassword(testcase.getProperty("password"));
        loginPage.clickLogIn();
    }
    @Test
    public void tc_001Validcase(){
        openNewAccountPage.clickOpenNewAccountLink();
        openNewAccountPage.clickAccountType();
        openNewAccountPage.clickAccountNumber();
        openNewAccountPage.clickOpenNewAccountButton();

    }
}