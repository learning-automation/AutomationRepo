package testcases.ui.RequestloanPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.RequestLoanpage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class RequestloanPageTestCase {
    Browser br;
    RequestLoanpage requestloanpage;
    WebDriver driver;
    Properties browser;

    @BeforeSuite
    public void beforesuite(){
     browser =TestDataReader.readProperties("Browser.properties");
     br = new Browser(browser.getProperty("browser"));

    }

    @BeforeTest
    public void beforetest(){

        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        requestloanpage = new RequestLoanpage(br.getDriver());

    }
    @Test
    public void Tc_001RequestLoan(){

        br.navigateUrl(browser.getProperty("url"));
        requestloanpage.requestloanhyperlnk();
        requestloanpage.enterLoanAmount(browser.getProperty("a"));
        requestloanpage.enterDownpayment(browser.getProperty("b"));
        requestloanpage.formAccount();
        requestloanpage.buttonClick();
        requestloanpage.lblerror();



    }
    @AfterTest
    public void Aftertest(){
        br.closeBrowser();
    }
}

