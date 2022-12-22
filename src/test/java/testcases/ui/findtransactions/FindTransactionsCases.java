package testcases.ui.findtransactions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.BillPayPage;
import pageObjects.FindTransactions;
import pageObjects.LoginPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class FindTransactionsCases {

    //---------------------------------------------------------------------------------------------------------
//    It will Launch the browser.

    Browser br;
    Properties browser;

    @BeforeSuite
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
    }

    //-------------------------------------------------------------------------------------------------------------
//    It will login the parabank homepage

    LoginPage loginPage = new LoginPage(br.getDriver());
    WebDriver driver;

    @BeforeMethod
    public void readData() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        loginPage = new LoginPage(br.getDriver());
        FindTransactions FT = new FindTransactions(br.getDriver());     // POM Page invoked here

        // for login
        Properties testcase = TestDataReader.readProperties("tc001.properties");
        br.navigateUrl(browser.getProperty("url"));
        loginPage.enterUsername(testcase.getProperty("username"));
        loginPage.enterPassword(testcase.getProperty("password"));
        loginPage.clickLogIn();
    }

    //-------------------------------------------------------------------------------------------------------------
//  >>>>>   TEST CASES


    FindTransactions FT = new FindTransactions(br.getDriver());

    @Test(priority = 1)
    public void tc001_FindTransactionByID() {

        FT.setClickFindTransactions();
        FT.setddSelectAccount("AccountNumber");
        FT.setEnterTransactionID("TransactionID");
        FT.clickBtnFindTransactionByID();
        Assert.assertEquals(FT.getErrorMsg().getText(), "An internal error has occurred and has been logged.", "Test Case1 is Passed");
    }


    @Test(priority = 2)
    public void tc002_FindTransactionByDate() {

        FT.setClickFindTransactions();
        FT.setddSelectAccount("AccountNumber");
        FT.setEnterTransactionByDate("ByDate");
        FT.clickBtnFindTransactionByDate();
        Assert.assertEquals(driver.getTitle(), "ParaBank | Find Transactions", "Test Case2 is passed");

    }

    @Test(priority = 3)
    public void tc003_FindTransactionByDateRange() {

        FT.setClickFindTransactions();
        FT.setddSelectAccount("AccountNumber");
        FT.setEnterTransactionFromDate("FromDate");
        FT.setEnterTransactionToDate("ToDate");
        FT.clickBtnFindTransactionByDateRange();
        Assert.assertEquals(driver.getTitle(), "ParaBank | Find Transactions", "Test case 3 is passed");
    }

    @Test(priority = 4)
    public void tc004_FindTransactionByAmount() {

        FT.setClickFindTransactions();
        FT.setddSelectAccount("AccountNumber");
        FT.setEnterTransactionAmount("ByAmount");
        FT.clickBtnFindTransactionByAmount();
        Assert.assertEquals(driver.getTitle(),"ParaBank | Find Transactions","Test case 4 is passed");
    }

    @AfterSuite
    public void closeBrowser(){
        br.closeBrowser();
    }
}