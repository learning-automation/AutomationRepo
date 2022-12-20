package testcases.ui.transferFund;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.TransferFunds;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class TransferFundValidTC {
    Browser br;
    TransferFunds fundtransfer;
    WebDriver driver;
    Properties browser;
    Properties testcase;
    LoginPage login;

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
        fundtransfer = new TransferFunds(br.getDriver());
        // for login
        testcase = TestDataReader.readProperties("tc001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testcase.getProperty("username"));
        login.enterPassword(testcase.getProperty("password"));
        login.clickLogIn();
    }
    @Test//(priority = 1)
    public void tc001_paraBank_TansferFund() {
        System.out.println("tc001_paraBank_TansferFund ===>");
        testcase = TestDataReader.readProperties(("tc001.properties"));
//        String url_to_navigate = browser.getProperty("url");
//        br.navigateUrl(url_to_navigate);
//        System.out.println("url_to_navigate: " + url_to_navigate);
        fundtransfer.linkTransferFund.click();
        //System.out.println("testcase.getProperty(\"amt\"): " + testcase.getProperty("amt"));
        fundtransfer.enterAmount(testcase.getProperty("amt"));
        fundtransfer.fromAccount();
        fundtransfer.toAccount();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // System.out.println("About to click transfer ====>");
        fundtransfer.clickButton();
    }
}

