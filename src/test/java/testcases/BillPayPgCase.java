package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.BillPayPg;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;
//-------------------

import java.util.Properties;

public class BillPayPgCase
{
    Properties testcase2;
    BillPayPg billPayPg;
    Properties testcase;
    LoginPage login;
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
        login = new LoginPage(br.getDriver());
        billPayPg = new BillPayPg(br.getDriver());
        // for login
        testcase = TestDataReader.readProperties("tc001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testcase.getProperty("username"));
        login.enterPassword(testcase.getProperty("password"));
        login.clickLogIn();
    }
    //-----------------------------------------

    @Test
    public void billPayTestCase()
    {
        billPayPg.clickBillPay();
        testcase2 = TestDataReader.readProperties("billpay.properties");
        billPayPg.enterTxtPayeename(testcase2.getProperty("payee"));
        billPayPg.enterTextAdresss(testcase2.getProperty("address"));
        billPayPg.enterTxtCity(testcase2.getProperty("city"));
        billPayPg.enterTxtState(testcase2.getProperty("state"));
        billPayPg.enterTxtZipcode(testcase2.getProperty("zipcode"));
        billPayPg.enterTxtPhonenumber(testcase2.getProperty("phone"));
        billPayPg.enterTxtAccountnumber(testcase2.getProperty("account"));
        billPayPg.enterTxtVerifyAccount(testcase2.getProperty("verifyaccount"));
        billPayPg.enterTxtAmount(testcase2.getProperty("amount"));
        billPayPg.enterSelectAccount();
        billPayPg.clickBtnSend();
    }

    @AfterSuite
    public void closeBrowser()
    {
        br.closeBrowser();
    }

}
