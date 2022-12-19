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
    ForgetLoginInfoPage forget_login;

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
        forget_login = new ForgetLoginInfoPage(br.getDriver());
    }

    @Test
    public void tC001_ForgetInfoParaBank() throws InterruptedException {
        testCase = TestDataReader.readProperties("forgetlogininfo.properties");
        br.navigateUrl(browser.getProperty("url"));
        forget_login.click_info();
        forget_login.getTitle(testCase.getProperty("title1"));
        forget_login.getInfoTitle(testCase.getProperty("title2"));
        forget_login.firstName(testCase.getProperty("first_name"));
        forget_login.lastName(testCase.getProperty("last_name"));
        forget_login.address(testCase.getProperty("address1"));
        forget_login.city(testCase.getProperty("city1"));
        forget_login.state(testCase.getProperty("state1"));
        forget_login.zip(testCase.getProperty("zip_code1"));
        forget_login.ssnCode(testCase.getProperty("ssn_number1"));

        forget_login.clickLogIn();

    }


}
