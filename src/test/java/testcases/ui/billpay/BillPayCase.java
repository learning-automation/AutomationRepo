package testcases.ui.billpay;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.BillPayPage;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;
//-------------------

import java.util.Properties;

public class BillPayCase
{
    Properties testcase2;
    BillPayPage billPayPage;
    Properties testcase;
    LoginPage loginPage;
    Properties browser;
    Browser br;
    WebDriver driver;

    //--------------------------------------------
    @BeforeSuite
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        loginPage = new LoginPage(br.getDriver());
        billPayPage = new BillPayPage(br.getDriver());
        // for login
        testcase = TestDataReader.readProperties("tc001.properties");
        br.navigateUrl(browser.getProperty("url"));
        loginPage.enterUsername(testcase.getProperty("username"));
        loginPage.enterPassword(testcase.getProperty("password"));
        loginPage.clickLogIn();
    }
    //-----------------------------------------

    @Test
    public void billPayTestCase()
    {
        billPayPage.clickBillPay();
        testcase2 = TestDataReader.readProperties("billpay.properties");
        billPayPage.enterTxtPayeename(testcase2.getProperty("payee"));
        billPayPage.enterTextAdresss(testcase2.getProperty("address"));
        billPayPage.enterTxtCity(testcase2.getProperty("city"));
        billPayPage.enterTxtState(testcase2.getProperty("state"));
        billPayPage.enterTxtZipcode(testcase2.getProperty("zipcode"));
        billPayPage.enterTxtPhonenumber(testcase2.getProperty("phone"));
        billPayPage.enterTxtAccountnumber(testcase2.getProperty("account"));
        billPayPage.enterTxtVerifyAccount(testcase2.getProperty("verifyaccount"));
        billPayPage.enterTxtAmount(testcase2.getProperty("amount"));
        billPayPage.enterSelectAccount();
        billPayPage.clickBtnSend();
    }

    @AfterSuite
    public void closeBrowser()
    {
        br.closeBrowser();
    }

}
