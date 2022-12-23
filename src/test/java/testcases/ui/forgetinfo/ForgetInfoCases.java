package testcases.ui.forgetinfo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.ForgetLoginInfoPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class ForgetInfoCases {

    Browser br;
    WebDriver driver;
    Properties browser;
    Properties testCase;
    ForgetLoginInfoPage forgetLoginInfoPage;

    @BeforeSuite
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readTestData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        forgetLoginInfoPage = new ForgetLoginInfoPage(br.getDriver());
    }
    @Test
    public void tC001_ForgetInfoParaBank() throws InterruptedException {
        testCase = TestDataReader.readProperties("ForgetLoginInfo.properties");
        br.navigateUrl(browser.getProperty("url"));
        forgetLoginInfoPage.clickForgotLoginInfo();
        forgetLoginInfoPage.getTitle(testCase.getProperty("title1"));
        forgetLoginInfoPage.getInfoTitle(testCase.getProperty("title2"));
        forgetLoginInfoPage.enterFirstName(testCase.getProperty("first_name"));
        forgetLoginInfoPage.enterLastName(testCase.getProperty("last_name"));
        forgetLoginInfoPage.enterAddress(testCase.getProperty("address1"));
        forgetLoginInfoPage.enterCity(testCase.getProperty("city1"));
        forgetLoginInfoPage.enterState(testCase.getProperty("state1"));
        forgetLoginInfoPage.enterZipCode(testCase.getProperty("zip_code1"));
        forgetLoginInfoPage.enterSSNCode(testCase.getProperty("ssn_number1"));
        forgetLoginInfoPage.clickLogIn();

    }


}
